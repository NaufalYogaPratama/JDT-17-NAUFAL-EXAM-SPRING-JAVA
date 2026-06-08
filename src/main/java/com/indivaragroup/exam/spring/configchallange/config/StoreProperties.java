package com.indivaragroup.exam.spring.configchallange.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "store")
public class StoreProperties {
    private String name;
    private String city;
    private String currency;
    private Integer maxDailyOrder;
    private Boolean active;
}
