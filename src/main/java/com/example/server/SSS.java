package com.example.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class SSS {

    @RequestMapping("sss")
    public Flux<String> sss() {
        return Flux.interval(Duration.ofSeconds(100)).map(i -> {
            return "hello";
        });
    }

}
