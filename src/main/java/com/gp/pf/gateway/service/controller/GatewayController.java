package com.gp.pf.gateway.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gp.pf.gateway.service.GatewayService;
import com.gp.pf.gateway.service.dto.GatewayRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/gateway")
@RequiredArgsConstructor
public class GatewayController {
	final private GatewayService gatewayService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void routeRequest(@RequestBody GatewayRequest gatewayRequest) {
		gatewayService.routeRequest(gatewayRequest);
	}
	

}
