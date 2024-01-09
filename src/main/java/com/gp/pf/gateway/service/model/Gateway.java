package com.gp.pf.gateway.service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("portfolio_gateway")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Gateway {
	@Id
	private String id;
	private String apiEndpoint;
	private String httpMethod;
	private String request;
}
