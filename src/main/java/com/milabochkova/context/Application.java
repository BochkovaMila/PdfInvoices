package com.milabochkova.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.milabochkova.service.InvoiceService;
import com.milabochkova.service.UserService;

public class Application {

    public static final UserService userService = new UserService();

}
