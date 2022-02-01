package com.bootcoin.bootcoin.controller;

import com.bootcoin.bootcoin.business.BootcoinService;
import com.bootcoin.bootcoin.model.Bootcoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class BootcoinController {
  @Autowired
  private BootcoinService bootcoinService;

  @GetMapping("/api/bootcoins")
  public Flux<Bootcoin> findAll() {
    log.info("<--find all-->");
    return bootcoinService.findAll();
  }

  @PostMapping("/api/bootcoins")
  @ResponseStatus(HttpStatus.CREATED)
  public Mono<Bootcoin> create(@RequestBody Bootcoin bootcoin) {
    log.info("<--controller create-->");
    return bootcoinService.create(bootcoin);
  }
}
