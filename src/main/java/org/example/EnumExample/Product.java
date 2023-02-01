package org.example.EnumExample;

public enum Product {
    // Define the enum constants first
    EGG(2, 0.0),
    CARROT(5, 0.0),
    LETTUCE(10, 0.05),
    BACON(15, 0.08),
    SAUSAGE(20, 0.23);

    // Define the fields and methods
    private final Integer price;
    private final Double vatRate;

    Product(Integer price, Double vatRate) {
        this.price = price;
        this.vatRate = vatRate;
    }

    public Integer getPrice() {
        return price;
    }

    public Double getVatRate() {
        return vatRate;
    }
}
