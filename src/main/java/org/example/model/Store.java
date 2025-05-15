package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = {new Chocolate("test" , 12 , "test") , new Bread("test2" , 122 , "test2") , new Coke("tes3t" , 132 , "tes3t")};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            product.showDetails();
        }
    }
}