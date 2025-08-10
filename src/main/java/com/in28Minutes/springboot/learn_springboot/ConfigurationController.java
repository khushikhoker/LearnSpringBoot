package com.in28Minutes.springboot.learn_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

    @RequestMapping("/currency-service")
    public CurrencyServiceConfiguration getCurrencyServiceConfiguration() {
        return currencyServiceConfiguration;
    }
}
