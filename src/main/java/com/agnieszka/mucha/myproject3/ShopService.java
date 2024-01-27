package com.agnieszka.mucha.myproject3;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Basic implementation of shop service
 */
public class ShopService {
    List<Product> products = new ArrayList<>();


    public ShopService() {
        products.add(new Product(52, "Small ficus"));
        products.add(new Product(50, "Decorative pot"));
        products.add(new Product(200, "Monster XL"));
        products.add(new Product(58, "Fertilizer"));
        products.add(new Product(120, "Perlit"));
    }

    /**
     * log products and sum of modified products prices
     */
    @EventListener(ApplicationReadyEvent.class)
    public void showBasket() {
        showProducts();
        logPriceToConsole(priceChange(sumProducts()));
    }

    /**
     * log product data to console
     */
    public void showProducts() {
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        products.forEach(System.out::println);
        System.out.println("----------------------------------------");
    }

    /**
     * @param originalPrice
     * @return modified price
     */
    public int priceChange(int originalPrice) {
        return originalPrice;
    }

    /**
     * @return - calculate sum of all product prices
     */
    public int sumProducts() {

        return products.stream()
                .map(Product::price)
                .mapToInt(Integer::intValue)
                .sum();
    }


    /**
     * @param price log product price to console
     */
    public void logPriceToConsole(int price) {
        System.out.println("Sum " + price + "zł");
    }

}
