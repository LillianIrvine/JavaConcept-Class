/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week3tasks;

/**
 *
 * @author lilly
 */
public class Customer {
    private String name;
    private String address;
    private int phoneNumber;
    private String email;
    
    //take array of Customer objects as parameter, returns the sorted array
    public static Customer[] sortCustomers(Customer[] customers){
    
        //outer loop - one less that total number of customers
        //puts largest element at the end of the array after each pass
        for(int i = 0; i <customers.length - 1; i++) {
        //stops before the last unsorted element since the larger values 
        //are already in their correct spots
        for (int j = 0; j < customers.length - i - 1; j++){
            //compares "name" using .compareTo
            //returns positive value if first string is greater than the second
            //returns 0 if strings are equal
            //returns negative value if first string is less than the second
        if (customers[j].getName().compareTo(customers[j + 1].getName()) > 0){
            
            //holder is a storage place for the current Customer object
        Customer holder = customers[j];
        //moves next customer into current position
        customers[j] = customers[j + 1];
        //puts customer stored in temp into the next customer position
        customers[j + 1] = holder;
                }
            }
        }
        return customers;//sorted array called customers
    }

  

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
