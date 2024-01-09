package com.gp.pf.gateway.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GatewayRequest {
	private String apiEndpoint;
	private String httpMethod;
	private String request;
}
