package com.gp.pf.gateway.service;

import org.springframework.stereotype.Service;

import com.gp.pf.gateway.service.dto.GatewayRequest;
import com.gp.pf.gateway.service.dto.Response;
import com.gp.pf.gateway.service.model.Gateway;
import com.gp.pf.gateway.service.repository.GatewayRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class GatewayService {
	final private GatewayRepository gatewayRepository;

	public Response routeRequest(GatewayRequest gatewayRequest) {		
		Gateway route = Gateway.builder()
				.apiEndpoint(gatewayRequest.getApiEndpoint())
				.httpMethod(gatewayRequest.getHttpMethod())
				.request(gatewayRequest.getRequest())
				.build();
		gatewayRepository.save(route);
		log.info("Login id: {} initiated",route.getId());
		Response response=new Response();
		response.setResponse(new String(route.toString()));
		return response;
	}
	
}
