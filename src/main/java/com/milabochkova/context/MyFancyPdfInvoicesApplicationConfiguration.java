package com.milabochkova.context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.milabochkova.ApplicationLauncher;
import com.milabochkova.service.InvoiceService;
import com.milabochkova.service.UserService;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackageClasses = ApplicationLauncher.class)
@PropertySource("classpath:/application.properties")
@PropertySource(value = "classpath:/application-${spring.profile.active}.properties",
                        ignoreResourceNotFound = true)
@EnableWebMvc
public class MyFancyPdfInvoicesApplicationConfiguration {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
