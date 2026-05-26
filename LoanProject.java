/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loanproject;
import java.array;

/**
 *
 * @author lilly
 */
public class LoanProject {

    public static void main(String[] args) {
        Loan[] loans;
        loans = new Loan[3]; //creating an array of three references to "loan" 
        //NO MEMORY USED, NO OBJECT CREATED
        
        Arrays.sort(loans);
        
        loans[1] = new Loan(2,3);
        loans[0] = new Loan(1, 4);
        loans[2] = new Loan(3, 1.4);
        
        for(int i = 0; i < loans.length; i++){
          System .out. println(loan);
        }
        
    }
}
