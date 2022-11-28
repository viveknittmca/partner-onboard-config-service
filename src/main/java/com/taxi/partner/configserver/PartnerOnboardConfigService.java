package com.taxi.partner.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PartnerOnboardConfigService {

	public static void main(String[] args) {
		SpringApplication.run(PartnerOnboardConfigService.class, args);
	}

}
