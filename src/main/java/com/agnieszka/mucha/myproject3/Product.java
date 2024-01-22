package com.agnieszka.mucha.myproject3;

public record Product(int price, String name) {


    @Override
    public String toString() {
        return name + " price: " + price;
    }
}
