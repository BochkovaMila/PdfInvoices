package com.milabochkova.context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.milabochkova.ApplicationLauncher;

import org.springframework.context.annotation.*;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackageClasses = ApplicationLauncher.class)
@PropertySource("classpath:/application.properties")
@PropertySource(value = "classpath:/application-${spring.profile.active}.properties",
                        ignoreResourceNotFound = true)
@EnableWebMvc
public class MyFancyPdfInvoicesApplicationConfiguration {

    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
