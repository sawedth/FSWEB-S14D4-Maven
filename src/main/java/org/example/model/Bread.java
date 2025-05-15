package org.example.model;

public class Bread extends ProductForSale{
    private boolean isWhite;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public void showDetails(){
        System.out.println("Description: " + getDescription() + "Type: " + getType() + "Price: " + getPrice() + "White: " + isWhite);
    }
}
