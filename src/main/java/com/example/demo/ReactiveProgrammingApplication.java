package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.service.FluxGeneratorService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
public class ReactiveProgrammingApplication {

	@Autowired
	private FluxGeneratorService fluxGeneratorService;
	
	public static void main(String[] args) {
		SpringApplication.run(ReactiveProgrammingApplication.class, args);
		//new ReactiveProgrammingApplication().simpleFluxTest();
		
	}
	
	public void simpleFluxTest() {
		fluxGeneratorService.getStringFlux().subscribe(e -> {
			System.out.println(e);
		});
	}

}
