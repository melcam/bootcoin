package com.bootcoin.bootcoin.business;

import com.bootcoin.bootcoin.model.Bootcoin;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BootcoinService {
  Flux<Bootcoin> findAll();

  Mono<Bootcoin> create(Bootcoin bootcoin);
}
