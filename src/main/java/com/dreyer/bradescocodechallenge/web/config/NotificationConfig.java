package com.dreyer.bradescocodechallenge.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.dreyer.bradescocodechallenge.infra.notification"
})
public class NotificationConfig {
}
