/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingfeepractice;

import java.util.Scanner;

/**
 *
 * @author kamogelo
 */
public class BankingFeePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int userInput = 0;
        boolean runNot = false;
        Scanner userIn = new Scanner(System.in);
        BankingFeesPractice transactionOne = new BankingFeesPractice () ;
        
        System.out.print("Enter number of Transactions: ");
        userInput = userIn.nextInt();
        runNot = transactionOne.isValid(userInput);
        transactionOne.calculate(runNot, userInput);
        
    }
    
}
