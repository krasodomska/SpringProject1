package com.agnieszka.mucha.myproject3;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
    List<Product> products = new ArrayList<>();

    public ShopService() {
        products.add(new Product(52, "Small ficus"));
        products.add(new Product(50, "Decorative pot"));
        products.add(new Product(200, "Monster XL"));
        products.add(new Product(58, "Fertilizer"));
        products.add(new Product(120, "Perlit"));
    }

    @EventListener(ApplicationReadyEvent.class)
    public void showBasket() {
        showProducts();
        sumProducts();
    }

    public void sumProducts() {
    }


    public void showProducts() {
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        products.forEach(System.out::println);
        System.out.println("----------------------------------------");
    }

}
