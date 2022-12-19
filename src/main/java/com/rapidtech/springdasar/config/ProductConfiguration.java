package com.rapidtech.springdasar.config;

import com.rapidtech.springdasar.Model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {
    @Bean
    public Product product(){
        return new Product();
    }

    @Bean
    public Category category(){
        return new Category();
    }

    @Bean
    public ProductCategory productCategory (Product product,Category category){
        return new ProductCategory(product,category);
    }
}
