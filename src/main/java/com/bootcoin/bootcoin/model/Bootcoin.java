package com.bootcoin.bootcoin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Bootcoin {
  private String id;
  private double buy;// tasa de compra
  private double sales;// tasa de venta
  private String number;// dni, cex o pasaporte
  private String phone;
  private String email;
  private double amount;// monto
  private Boolean payment;// modo de pago 1=yanki y 0= transferencia

}
