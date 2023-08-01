package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //스프링 MVC에서 컨트롤러 역할이라는 것을 알림 & Bean 처리됨
@Log4j2
public class SampleController {

    @GetMapping("/hello")
    public void hello(){
        log.info("hello.............");

    }
}