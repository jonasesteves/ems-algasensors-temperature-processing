package com.jonasesteves.algasensors.temperatureprocessing.api.config.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    /* (10.6) */

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToTSIDConverter());
    }
}
