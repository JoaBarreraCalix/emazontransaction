package com.example.emazontransaction.infrastructure.feignclient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Emazon", url = "http://localhost:9090") // Asegúrate de que el puerto y nombre son correctos
public interface StockFeignClient {

    @GetMapping("/articles/{articleId}/exists")
    boolean checkIfArticleExists(@PathVariable("articleId") Long articleId);
}
