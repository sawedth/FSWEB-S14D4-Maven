package org.example.model;

public class Chocolate extends ProductForSale{

    private boolean isBitter;
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Description: " + getDescription() + "Type: " + getType() + "Price: " + getPrice() + "Bitter: " + isBitter);
    }
}
