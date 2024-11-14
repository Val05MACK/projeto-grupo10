package com.example.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Aplica a configuração a todas as rotas
                .allowedOrigins("http://localhost:8080") // Permite CORS apenas para o front-end específico
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Permite os métodos necessários
                .allowedHeaders("*")  // Permite todos os cabeçalhos
                .allowCredentials(true);  // Permite envio de cookies, se necessário
    }
    
}
