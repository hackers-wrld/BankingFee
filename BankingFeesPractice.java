/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingfeepractice;

/**
 *
 * @author kamogelo
 */
public class BankingFeesPractice {
    
  private int NumberOfTransaction ;
  private double BaseFee = 200;
  private double BankingServiceFeeOne = 25.50;
  private double BankingServiceFeeTwo = 20.00;
  private double BankingServiceFeeThree = 15.50;
  private double BankingServiceFeeFour = 10.00;
  private double TransactionFee ;
  private double Discount ;
  private boolean runNot ;
  private double ServiceFee ;
  private double CalcDiscount;
  
 
 public  boolean isValid(int userInput ) {
     this.NumberOfTransaction = userInput;
    if (userInput > 0) {
        runNot = true;
    
    } else {
        
        runNot = false;
      displayError ();
    }
    
    return runNot;
  }

  public void calculate(boolean runNOT, int NumberOfTransactions) {

    if (runNOT) {
      // if runNot > 0
      if (NumberOfTransactions <= 10) {
          
      ConditionOne(NumberOfTransactions);
      
    } else if (NumberOfTransactions >= 10 && NumberOfTransactions <= 29) {
        
      ConditionTwo(NumberOfTransactions);
      
    } else if (NumberOfTransactions >= 30 && NumberOfTransactions <= 49) {
        
      ConditionThree (NumberOfTransactions);
      
    } else if (NumberOfTransactions >= 50) {
        
      ConditionFour (NumberOfTransactions);
      
    }
  }
  }
  
  public void displayError () {
      System.out.println("Negative number was entered");
  }

  public void ConditionOne (int NumberOfTransactions) {
      
    double tempTransactionFee = NumberOfTransactions * BankingServiceFeeOne;
    this.Discount = 0;
    this.TransactionFee = tempTransactionFee;
    this.ServiceFee = this.TransactionFee + this.BaseFee;
    displayOutput();
  
  }
  
  void displayOutput() {
      System.out.println("***Summery of transactions***");
      
      System.out.printf("%-30s%2d\n", "Number Of Transactions: " , this.NumberOfTransaction);
      System.out.printf("%-30s%1s%4.2f\n", "Base banking fee:","R" ,this.BaseFee );
      System.out.printf("%-30s%1s%4.2f\n", "Transaction:","R", this.TransactionFee);
      System.out.printf("%-30s%1s%4.2f\n", "Discount:", "R", this.Discount );
      System.out.printf("%-30s%1s%4.2f\n", "Service fee:", "R", this.ServiceFee);
      
  }

  void ConditionTwo (int NumberOfTranscation) {
    double tempTransactionFee = NumberOfTranscation * BankingServiceFeeTwo;
    this.Discount = 0;
    this.TransactionFee = tempTransactionFee;
    this.ServiceFee = this.TransactionFee + this.BaseFee;

    displayOutput() ;
    
  }

  public void ConditionThree (int NumberOfTransaction) {
    double tempTransactionFee = NumberOfTransaction * BankingServiceFeeThree;
    this.CalcDiscount = 2.5 / 100;
    
    this.TransactionFee = tempTransactionFee;
    this.Discount = this.TransactionFee * this.CalcDiscount;
    this.ServiceFee = this.TransactionFee + this.BaseFee - this.Discount;
    displayOutput() ;
  }

    public void ConditionFour (int NumberOfTransaction) {
        double tempTransactionFee = NumberOfTransaction * BankingServiceFeeFour;
         this.CalcDiscount = 4.0 / 100;
        
        this.TransactionFee = tempTransactionFee;
        this.Discount = this.TransactionFee * this.CalcDiscount;
        this.ServiceFee = this.TransactionFee + this.BaseFee - this.Discount;
        displayOutput() ;
        
      }
    
    }
    

  


