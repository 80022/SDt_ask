/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Date;

/**
 *
 * @author Computer Science
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account()
    {
    }
    public Account(int d , double b)
    {
        id=d;
        balance =b;
        dateCreated=new java.util.Date();
    }
    public void setId(int d)
    {
        id=d;
     }
      public void setBalance(double b)
    {
        balance=b;
     }
        public void setAnnualInterestRate(double a)
    {
        annualInterestRate=a;
     }
        public int getId()
        {
            return id;
        }
         public double getBalance()
        {
            return balance;
        }
          public double getAnnualInterestRate()
        {
            return annualInterestRate;
        }
         
          public double getMonthlyInterestRate()
          {
              return (annualInterestRate/100)/12;
          }
          public void withdraw(double Amount)
          {
              balance=balance-Amount;
          }
          public void deposit(double Amount)
          {
              balance=balance+Amount;
          }
          public double getMonthlyInterest()
          {
              return balance*getMonthlyInterestRate();
          }
          public Date getDateCreated()
          {
              return dateCreated;
          }
    
}
