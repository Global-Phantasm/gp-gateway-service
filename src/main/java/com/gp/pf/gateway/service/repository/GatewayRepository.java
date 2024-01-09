package com.gp.pf.gateway.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gp.pf.gateway.service.model.Gateway;

public interface GatewayRepository extends MongoRepository<Gateway, String>{

}
