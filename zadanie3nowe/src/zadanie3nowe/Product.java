/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie3nowe;

/**
 *
 * @author joanna
 */
public class Product {
        
    private int id;
    private String name;
    private Double price;
    private String category;
    
    Product(int id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    
    public String getCategory() {
        return category;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + category + " " + price;
    }
}
