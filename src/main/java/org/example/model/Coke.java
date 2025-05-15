package org.example.model;

public class Coke extends ProductForSale{
    private boolean isSugarFree;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }
    public void showDetails(){
        System.out.println("Description: " + getDescription() + "Type: " + getType() + "Price: " + getPrice() + "Sugar Free: " + isSugarFree);
    }
}
