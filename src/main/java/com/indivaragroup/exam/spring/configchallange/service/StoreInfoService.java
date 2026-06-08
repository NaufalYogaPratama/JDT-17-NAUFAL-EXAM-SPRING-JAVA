package com.indivaragroup.exam.spring.configchallange.service;

import com.indivaragroup.exam.spring.configchallange.config.StoreProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreInfoService {
    private final StoreProperties storeProperties;

    public String getStoreInfoString() {
        return String.format(
                "Store Name      : %s\n" +
                        "Store City      : %s\n" +
                        "Currency        : %s\n" +
                        "Max Daily Order : %d\n" +
                        "Active          : %b",
                storeProperties.getName(),
                storeProperties.getCity(),
                storeProperties.getCurrency(),
                storeProperties.getMaxDailyOrder(),
                storeProperties.getActive()
        );
    }
}
