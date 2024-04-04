package com.example;

/* 
 * {"totSellamnt":113342318000,"returnValue":"success","drwNoDate":"2024-03-30",
 * "firstWinamnt":1987426822,"drwtNo6":44,"drwtNo4":21,"firstPrzwnerCo":14,"drwtNo5":32,"bnusNo":8,
 * "firstAccumamnt":27823975508,"drwNo":1113,"drwtNo2":13,"drwtNo3":20,"drwtNo1":11}
 */


public class LottoDto {
  private Long id;
  private int drwNo;
  private Long totSellamnt;
  private String returnValue;
  private String drwNoDate;
  private Long firstWinamnt;
  private Long firstAccumamnt;
  private int firstPrzwnerCo;
  private int drwtNo1;
  private int drwtNo2;
  private int drwtNo3;
  private int drwtNo4;
  private int drwtNo5;
  private int drwtNo6;
  private int bnusNo;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public int getDrwNo() {
    return drwNo;
  }

  public void setDrwNo(int drwNo) {
    this.drwNo = drwNo;
  }

  public Long getTotSellamnt() {
    return totSellamnt;
  }

  public void setTotSellamnt(Long totSellamnt) {
    this.totSellamnt = totSellamnt;
  }

  public String getReturnValue() {
    return returnValue;
  }

  public void setReturnValue(String returnValue) {
    this.returnValue = returnValue;
  }

  public String getDrwNoDate() {
    return drwNoDate;
  }

  public void setDrwNoDate(String drawNoDate) {
    this.drwNoDate = drawNoDate;
  }

  public Long getFirstWinamnt() {
    return firstWinamnt;
  }

  public void setFirstWinamnt(Long firstWinamnt) {
    this.firstWinamnt = firstWinamnt;
  }

  public Long getFirstAccumamnt() {
    return firstAccumamnt;
  }

  public void setFirstAccumamnt(Long firstAccumamnt) {
    this.firstAccumamnt = firstAccumamnt;
  }

  public int getDrwtNo1() {
    return drwtNo1;
  }

  public void setDrwtNo1(int drwtNo1) {
    this.drwtNo1 = drwtNo1;
  }

  public int getDrwtNo2() {
    return drwtNo2;
  }

  public void setDrwtNo2(int drwtNo2) {
    this.drwtNo2 = drwtNo2;
  }

  public int getDrwtNo3() {
    return drwtNo3;
  }

  public void setDrwtNo3(int drwtNo3) {
    this.drwtNo3 = drwtNo3;
  }

  public int getDrwtNo4() {
    return drwtNo4;
  }

  public void setDrwtNo4(int drwtNo4) {
    this.drwtNo4 = drwtNo4;
  }

  public int getDrwtNo5() {
    return drwtNo5;
  }

  public void setDrwtNo5(int drwtNo5) {
    this.drwtNo5 = drwtNo5;
  }

  public int getDrwtNo6() {
    return drwtNo6;
  }

  public void setDrwtNo6(int drwtNo6) {
    this.drwtNo6 = drwtNo6;
  }

  public int getBnusNo() {
    return bnusNo;
  }

  public void setBnusNo(int bnusNo) {
    this.bnusNo = bnusNo;
  }

  public int getFirstPrzwnerCo() {
    return firstPrzwnerCo;
  }

  public void setFirstPrzwnerCo(int firstPrzwnerCo) {
    this.firstPrzwnerCo = firstPrzwnerCo;
  }

  @Override
  public String toString() {
    return "row [drwNo=" + drwNo + ", totSellamnt=" + totSellamnt + ", returnValue="
        + returnValue + ", drawNoDate=" + drwNoDate + ", firstWinamnt=" + firstWinamnt
        + ", firstAccumamnt=" + firstAccumamnt + ", drwtNo1=" + drwtNo1 + ", drwtNo2=" + drwtNo2
        + ", drwtNo3=" + drwtNo3 + ", drwtNo4=" + drwtNo4 + ", drwtNo5=" + drwtNo5 + ", drwtNo6="
        + drwtNo6 + ", bnusNo=" + bnusNo + "]";
  }

  public LottoRow getRecord() {
    LottoRow row = new LottoRow();
    row.setDrwNo(drwNo);
    row.setTotSellamnt(totSellamnt);
    row.setReturnValue(returnValue);
    row.setDrwNoDate(drwNoDate);
    row.setFirstWinamnt(firstWinamnt);
    row.setFirstAccumamnt(firstAccumamnt);
    row.setFirstPrzwnerCo(firstPrzwnerCo);
    row.setDrwtNo1(drwtNo1);
    row.setDrwtNo2(drwtNo2);
    row.setDrwtNo3(drwtNo3);
    row.setDrwtNo4(drwtNo4);
    row.setDrwtNo5(drwtNo5);
    row.setDrwtNo6(drwtNo6);
    row.setBnusNo(bnusNo);
    return row;
  }

  
}
