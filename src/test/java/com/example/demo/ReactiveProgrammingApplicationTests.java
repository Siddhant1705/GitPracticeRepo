package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.FluxGeneratorService;

@SpringBootTest
class ReactiveProgrammingApplicationTests {

	@Autowired
	private FluxGeneratorService fluxGeneratorService;

	@Test
	void simpleFluxTest() {
		fluxGeneratorService.getStringFlux().log().subscribe(e -> {
			System.out.println(e);
		});
	}

}
