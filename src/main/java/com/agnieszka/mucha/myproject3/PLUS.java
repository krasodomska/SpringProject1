package com.agnieszka.mucha.myproject3;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "shop-setup-plus")
@Profile("PLUS")
public class PLUS extends ShopService{
    private int VAT;

    @ Override
    public void sumProducts() {
        int sum = (Integer) products.stream()
                .map(Product::getPrice)
                .mapToInt(Integer::intValue)
                .sum();

        sum += sum * VAT / 100;

        System.out.println("Sum with VAT " +
                sum
                + "zł"
        );
    }


    public void setVAT(int VAT) {
        this.VAT = VAT;
    }

}
