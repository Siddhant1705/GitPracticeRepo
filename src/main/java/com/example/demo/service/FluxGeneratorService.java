package com.example.demo.service;

import java.time.Duration;
import java.util.List;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class FluxGeneratorService {

	public Flux<String> getStringFlux() {
		return Flux.just("Siddhant", "Ashit", "Rahul", "Janvi", "shekhar").delayElements(Duration.ofSeconds(2));
	}

	public Flux<String> getFruitFlux() {

		return Flux.fromIterable(List.of("Mango", "banana", "guava", "apple", "orange"));
	}

	public Flux<Void> getEmptyFlux() {
		return Flux.empty();
	}

	public Flux<String> getMapFlux() {
		Flux<String> capFlux = getStringFlux().map(e -> e.toUpperCase());
		return capFlux;
	}
}
