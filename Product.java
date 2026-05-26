/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week3tasks;
import java.util.List;
/**
 *
 * @author lilly
 */
public class Product {
    private String name;
    private double unitPrice;
    
//a method that takes a list of products and sort it in decreasing order
//using Unit price field    
   

public class ProductSorter {

    public static List<Product> sortProducts(List<Product> products) {
 
        //stops at second to last element bc already sorted using the following loops
        for (int i = 0; i < products.size() - 1; i++) {
            
        //will stop before the last sorted element
            for (int j = 0; j < products.size() - i - 1; j++) {
              
                //if current price is less than...swap (for descending order)
                if (products.get(j).getUnitPrice() < products.get(j + 1).getUnitPrice()) {
                 
                    //current price is stored in holder
                    Product holder = products.get(j);
                    //inserts the next price into current position
                    products.set(j, products.get(j + 1));
                    //inserts the price stored in holder to the next position
                    products.set(j + 1, holder);
                }
            }
        }
        return products; // Return sorted list
    }


    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", unitPrice=" + unitPrice + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
