package com.agnieszka.mucha.myproject3;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("START")
public class START extends ShopService{
    @ Override
    public void sumProducts() {
        int sum = (Integer) products.stream()
                .map(Product::getPrice)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum with VAT " +
                sum
                + "zł"
        );
    }
}
