package com.bootcoin.bootcoin.controller;

import java.util.Map;

import com.bootcoin.bootcoin.business.BootcoinService;
import com.bootcoin.bootcoin.model.Bootcoin;
import com.bootcoin.bootcoin.repository.BootcoinRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  private BootcoinRepository bootcoinRepository;

  public BootcoinController(BootcoinRepository bootcoinRepository) {
    this.bootcoinRepository = bootcoinRepository;
  }

  @GetMapping("/api/bootcoins")
  public Map<String, Bootcoin> findAll() {
    log.info("<--find all-->");
    return bootcoinRepository.findAll();
  }

  @GetMapping("/api/bootcoins/{id}")
  public Bootcoin findById(@PathVariable String id) {
    log.info("<--find by id-->");
    return bootcoinRepository.findById(id);
  }

  @PostMapping("/api/bootcoins")
  public void create(@RequestBody Bootcoin bootcoin) {
    log.info("<--controller create-->");
    bootcoinRepository.save(bootcoin);
  }

  @DeleteMapping("/api/bootcoins/{id}")
  public void delete(@PathVariable String id) {
    log.info("<--delete-->");
    bootcoinRepository.delete(id);
  }
}
