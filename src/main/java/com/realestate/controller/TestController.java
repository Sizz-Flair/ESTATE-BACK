package com.realestate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.realestate.controller
 * fileName       : TestContoller
 * author         : akfur
 * date           : 2023-08-09
 */
@RestController
public class TestController {

    @GetMapping(path = "/test")
    public void test() {
        System.out.println("test");
    }
}
