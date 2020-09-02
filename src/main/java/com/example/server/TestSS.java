package com.example.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class TestSS {

    @RequestMapping("hello")
    public Flux<String> greeting(){
        return Flux.just("hello");
    }

}
