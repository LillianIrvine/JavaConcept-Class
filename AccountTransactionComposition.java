/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accounttransactioncomposition;

/**
 *
 * @author lilly
 */
public class AccountTransactionComposition {

    public static void main(String[] args) {
        Account SueAccount;
        SueAccount = new Account(43219, "Lilly", 2050);
        SueAccount.setAnnualInterestRate(2.35);
        
        //deposit
        SueAccount.deposit(350);
        SueAccount.deposit(200);
        SueAccount.deposit(120);
        
        //withdraw
        SueAccount.withdraw(20);
        SueAccount.withdraw(230);
        SueAccount.withdraw(150);
        
        SueAccount.PrintAccountSummary();
    }
}
