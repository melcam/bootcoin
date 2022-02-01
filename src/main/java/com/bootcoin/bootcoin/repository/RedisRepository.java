package com.bootcoin.bootcoin.repository;

import java.util.Map;

import com.bootcoin.bootcoin.model.Bootcoin;

public interface RedisRepository {
  Map<String, Bootcoin> findAll();

  Bootcoin findById(String id);

  void save(Bootcoin bootcoin);

  void delete(String id);
}
