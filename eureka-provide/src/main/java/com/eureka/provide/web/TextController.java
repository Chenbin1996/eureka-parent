package com.eureka.provide.web;

import com.eureka.provide.dto.TextDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class TextController {
    @GetMapping("/hello")
    public TextDTO hello(){
        TextDTO textDTO = new TextDTO();
        textDTO.setName("测试数据");
        textDTO.setSex("测试数据");
        return textDTO;
    }
}
