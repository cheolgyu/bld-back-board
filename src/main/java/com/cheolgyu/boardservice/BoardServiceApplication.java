package com.cheolgyu.boardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class BoardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardServiceApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "board Hello WebFlux!!!";
	}

	@GetMapping("/board/hello")
	public String boardhello() {
		return "boarboardboardd Hello WebFlux!!!";
	}

}
