package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LottoRow {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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
  
}
