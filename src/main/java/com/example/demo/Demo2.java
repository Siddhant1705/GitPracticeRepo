package com.example.demo;

import java.time.Duration;

import reactor.core.Disposable;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple3;

public class Demo2 {

	public static void main(String[] args) {
		Demo2 demo2ref = new Demo2();
		demo2ref.workingWithMono();
	}

	public void workingWithMono() {
		// Mono creation
		Mono<String> mono1 = Mono.just("mono is publisher with 0 or 1 items only.");
		Mono<String> mono2 = Mono.just("This is second mono");
		Mono<Integer> mono3 = Mono.just(123456);
		Mono<Tuple3<String, String, Integer>> zip = Mono.zip(mono1, mono2, mono3);

		Mono<String> map = mono1.map(e -> e.toUpperCase());

		map.subscribe(e -> System.out.println(e));

		Mono<String[]> flatMap = mono1.flatMap(m1 -> Mono.just(m1.split(" ")));

		flatMap.subscribe(e -> {
			for (String element : e) {
				System.out.println(element);
			}
		});

//		Mono<Object> errorMono = Mono.error(new RuntimeException("error has been occured!!!"));

		// mono subscription
//		mono1.subscribe(m -> {
//			System.out.println("data : " + m);
//		});

		// errorMono.subscribe(e -> System.out.println(e));

//		zip.subscribe(data -> {
//			System.out.println(data.getT1());
//			System.out.println(data.getT2());
//			System.out.println(data.getT3());
//		});

	}
}
