/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loanproject;

/**
 *
 * @author lilly
 */
public class Loan implements Comparable<Loan>{
    private double rate;
    private double amount;

    @Override
    public String toString() {
        return "Loan{" + "rate=" + rate + ", amount=" + amount + '}';
    }
    
    public Loan(double rate, double amount) {
        this.rate = rate;
        this.amount = amount;
    }
    

    public double getRate() {
        return rate;
    }

    public double getAmount() {
        return amount;
    }

    public Loan() {
    }

    @Override
    public int compareTo(Loan o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return Double.compare(this.getAmount(), o.getAmount());
    
    }
    
}
