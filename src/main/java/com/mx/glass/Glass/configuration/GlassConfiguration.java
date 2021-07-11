package com.mx.glass.Glass.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlassConfiguration {

    @Bean
    public ShippingConfiguration getShippingConfiguration(){
        return new ShippingConfigurationBd();
    }
}
