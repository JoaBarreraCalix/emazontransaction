package com.example.emazontransaction.infrastructure.configuration;

import feign.RequestInterceptor;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Configuration
public class FeignClientConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            if (attributes != null) {
                HttpServletRequest request = attributes.getRequest();

                // Obtener el JWT token desde el header
                String jwtToken = request.getHeader("Authorization");

                if (jwtToken != null && jwtToken.startsWith("Bearer ")) {
                    // Agregar el token a la cabecera de la solicitud Feign
                    requestTemplate.header("Authorization", jwtToken);

                    // Log para verificar el token
                    System.out.println("JWT Token in Feign Request: " + jwtToken);
                } else {
                    System.out.println("No JWT Token found in HttpServletRequest");
                }
            }
        };
    }
}
