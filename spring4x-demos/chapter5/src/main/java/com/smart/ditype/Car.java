package com.smart.ditype;

/**
 * 5.3.2 节 通过自身类型反射匹配入参
 */
public class Car {
    private String brand;
    private int maxSpeed;
    private double price;

    public Car() {
    }

    public Car(String brand, int maxSpeed, double price) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
