/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accounttransactioncomposition;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author lilly
 */
public class Account {
    private int id;
    private String name;
    private double balance;
    private double annualIntrestRate;
    private Date date;
    private ArrayList<Transaction> transactions;
    
    public Account(){
        this(0, "Unkown", 0);
    };
    public Account(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.annualIntrestRate = 0;
        this.date = new Date();
        this.transactions = new ArrayList<>();
    };
    
        public double getAnnualIntrestRate() {
        return annualIntrestRate;
    }

    public void setAnnualIntrestRate(double annualIntrestRate) {
        this.annualIntrestRate = annualIntrestRate;
}
    
    public double getMonthlyIntrestRate(){
        return annualInterestRate /12;
    }
    
    public double getMonthlyIntrest(){
        return balance * (getMonthlyInterestRate() / 100);
    }
    
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal of $" + amount);
        } else {
            balance -= amount;
            transactions.add(new Transaction('W', amount, "Withdrawal"));
        }
    }
    
    public void deposit(double amount){
        balance += amount;
        transactions.add(new Transaction('D', amount, "Deposit"));
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + ", annualIntrestRate=" + annualIntrestRate + ", date=" + date + ", transactions=" + transactions + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

public void printAccountSummary(){

System.out.println("Account Summary: ");
System.out.println("ID: " = id);
System.out.println("Name: " = name);
System.out.println("Interest Rate: " + annualInterestRate + "%");
System.out.println("Balance: $" + balance);
System.out.println("Date created: " + date);
System.out.println("Transactions: ");
for (Transaction t : transactions){
System.out.println(t);
    }
} 

}

