package com.example.githubactionstudy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class DemoController {

    @Value("${test.value}")
    String testValue;

    @GetMapping("/demo")
    public Mono<String> demo() {
        return Mono.just("demo: " + testValue);
    }
}
