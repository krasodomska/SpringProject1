package com.agnieszka.mucha.myproject3;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@ConfigurationProperties(prefix = "shop-setup-pro")
@Profile("PRO")
public class PRO extends ShopService{
    private int VAT;
    private int discount;

    @ Override
    public void sumProducts() {
        int sum = (Integer) products.stream()
                .map(Product::getPrice)
                .mapToInt(Integer::intValue)
                .sum();

        sum += sum * VAT / 100;
        sum -= sum * discount / 100;

        System.out.println("Sum with VAT with discount " +
                sum
                + "zł"
        );
    }




    public void setVAT(int VAT) {
        this.VAT = VAT;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
