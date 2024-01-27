package com.agnieszka.mucha.myproject3;

/**
 * abstraction over the product model
 *
 * @param price
 * @param name
 */
public record Product(int price, String name) {


    @Override
    public String toString() {
        return name + " price: " + price;
    }
}
