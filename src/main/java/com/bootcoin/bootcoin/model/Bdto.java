package com.bootcoin.bootcoin.model;

import lombok.Data;

@Data
public class Bdto {
  private String id;
  private String number;
  private String phone;
  private String email;
  private double amount;
  private Boolean payment;
}
