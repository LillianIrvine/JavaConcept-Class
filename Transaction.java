/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.accounttransactioncomposition;



/**
 *
 * @author lilly
 */

import java.util.Date;

public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private String description;
    
    public Transaction(char type, double amount, String description){
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.description = description;
    };

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transction{" + "date=" + date + ", type=" + type + ", amount=" + amount + '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
