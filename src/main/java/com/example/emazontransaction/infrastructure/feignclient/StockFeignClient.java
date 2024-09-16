package com.example.emazontransaction.infrastructure.feignclient;


import com.example.emazontransaction.infrastructure.configuration.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "Emazon", url = "http://localhost:9090", configuration = FeignClientConfig.class)
public interface StockFeignClient {

    @GetMapping("/articles/{articleId}/exists")
    boolean checkIfArticleExists(@PathVariable("articleId") Long articleId);
}