package com.eureka.client.service;

import com.eureka.client.dto.TextDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-service", path = "/app")
public interface TextService {
    @GetMapping("/hello")
    TextDTO hello();
}
