package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.FluxGeneratorService;

public class FluxDemo {

	@Autowired
	private FluxGeneratorService fluxGeneratorService;
	
	public static void main(String[] args) {
		FluxDemo fluxDemo = new FluxDemo();
		fluxDemo.simpleFluxTest();
	}
	
	public void simpleFluxTest() {
		fluxGeneratorService.getStringFlux().subscribe(e -> {
			System.out.println(e);
		});
	}

}
