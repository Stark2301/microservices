package com.arya.Map;

class Phone{
    String brand;
    String  model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

public class WeakHashMap {
    public static void main(String[] args) {

        Phone phone = new Phone("Apple","16 pro");
        System.out.println(phone);
    }
}
