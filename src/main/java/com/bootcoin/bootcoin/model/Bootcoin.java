package com.bootcoin.bootcoin.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "bootcoin")
public class Bootcoin {
  @Id
  private String id = UUID.randomUUID().toString();
  private double buy;// tasa de compra
  private double sales;// tasa de venta
  private String number;// dni, cex o pasaporte
  private String phone;
  private String email;
  private double amount;// monto
  private Boolean payment;// modo de pago 1=yanki y 0= transferencia

}
