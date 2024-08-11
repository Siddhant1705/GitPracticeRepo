package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FluxGeneratorService;

import reactor.core.publisher.Flux;

@RestController
public class FluxController {
	@Autowired
	private FluxGeneratorService fluxGeneratorService;

	@GetMapping("/getFlux")
	public Flux<String> getFlux() {
		return fluxGeneratorService.getStringFlux();
	}
}
