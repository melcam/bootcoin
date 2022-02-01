package com.bootcoin.bootcoin.repository;

import com.bootcoin.bootcoin.model.Bootcoin;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BootcoinRepository extends ReactiveMongoRepository<Bootcoin, String> {

}
