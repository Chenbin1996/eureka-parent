package com.example.demo.web;

import com.eureka.client.dto.TextDTO;
import com.eureka.client.service.TextService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping
public class DemoController {
    @Resource
    private TextService textService;
    @GetMapping("/")
    public TextDTO hello(){
        return textService.hello();
    }
}
