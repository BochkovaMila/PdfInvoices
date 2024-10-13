package com.milabochkova.context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.milabochkova.ApplicationLauncher;
import com.milabochkova.service.InvoiceService;
import com.milabochkova.service.UserService;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackageClasses = ApplicationLauncher.class)
public class MyFancyPdfInvoicesApplicationConfiguration {

    public UserService userService() {
        return new UserService();
    }

    public InvoiceService invoiceService(UserService userService) {
        return new InvoiceService(userService);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
