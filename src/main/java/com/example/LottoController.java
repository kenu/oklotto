package com.example;

import java.nio.charset.Charset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class LottoController {

  @Autowired
  private LottoRepository lottoNumberRepository;

  @GetMapping("/645")
  public String fetchLottoNumbers() throws JsonMappingException, JsonProcessingException {
    StringHttpMessageConverter stringHttpMessageConverter =
        new StringHttpMessageConverter(Charset.forName("euc-kr"));

    RestTemplate restTemplate = new RestTemplate();
    restTemplate.getMessageConverters().add(stringHttpMessageConverter);

    String url = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=1113";
    String lottoDrawString = restTemplate.getForObject(url, String.class);
    
    LottoDto lotto = new ObjectMapper().readValue(lottoDrawString, LottoDto.class);
    // 여기서 lottoNumbers를 적절히 처리하여 LottoNumber 엔티티에 저장합니다.
    // 예를 들어, 로또 번호를 파싱하고 엔티티를 생성한 후 리포지토리를 통해 저장합니다.
    System.out.println(lotto);
    LottoRow row = lotto.getRecord();
    lottoNumberRepository.save(row );

    return "Lotto numbers fetched and saved.";
  }
}
