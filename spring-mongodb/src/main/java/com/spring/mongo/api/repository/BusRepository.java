package com.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.Bus;

public interface BusRepository extends MongoRepository<Bus,Integer>{

}
