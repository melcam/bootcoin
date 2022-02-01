package com.bootcoin.bootcoin.business.impl;

import com.bootcoin.bootcoin.business.BootcoinService;
import com.bootcoin.bootcoin.model.Bootcoin;
import com.bootcoin.bootcoin.repository.BootcoinRepository;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class BootcoinServiceImpl implements BootcoinService {

  private BootcoinRepository bootcoinRepository;

  public BootcoinServiceImpl(BootcoinRepository bootcoinRepository) {
    this.bootcoinRepository = bootcoinRepository;
  }

  @Override
  public Flux<Bootcoin> findAll() {
    return bootcoinRepository.findAll();
  }

  @Override
  public Mono<Bootcoin> create(Bootcoin bootcoin) {
    log.info("Start to create");
    if (!bootcoin.getNumber().isBlank()) {
      bootcoin.setBuy(1010.00);
      bootcoin.setSales(1015.00);
    }

    return bootcoinRepository.save(bootcoin);
  }

}
