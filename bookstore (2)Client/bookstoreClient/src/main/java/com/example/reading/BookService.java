package com.example.reading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreakerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class BookService {

    private static final Logger log = LoggerFactory.getLogger(BookService.class);
    private final WebClient webClient;
    private final ReactiveCircuitBreaker circuitBreaker;

    public BookService(ReactiveCircuitBreakerFactory circuitBreakerFactory) {
        this.webClient = WebClient.builder().baseUrl("http://localhost:8090").build();
        this.circuitBreaker = circuitBreakerFactory.create("book-service");
    }

    public Mono<String> readingList() {
        return circuitBreaker.run(
                webClient.get().uri("/recommended")
                        .retrieve()
                        .bodyToMono(String.class),
                throwable -> {
                    log.warn("Error calling book service", throwable);
                    return Mono.just("Cloud Native Java (O'Reilly) - Fallback");
                }
        );
    }
}