package com.example.instancetest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {설명을 작성해주세요}
 *
 * @author koesnam
 * @since 2023/07/03
 */
@RestController
public class TestRestController {
    @GetMapping
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/v2")
    public String sayHello2() {
        return "hello to my little friend";
    }
}
