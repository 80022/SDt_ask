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
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // Question 1:
        
        
           /* TV tv1=new TV ();
           tv1.setChannel(130);
           tv1.print_TV_data();

           System.out.println("**************************************");
           tv1.setChannel(152);
           tv1.setVolume(9);
           tv1.ChannelUp();
           tv1.volumDown();
           tv1.turnOff();
           tv1.print_TV_data();*/
        
    //Question2:
        
        Account A=new Account(1122,20000);
        Date dataCreated=new Date();
        A.setAnnualInterestRate(4.5);
        A.withdraw(2500);
        A.deposit(3000);
        System.out.println("Balance = "+A.getBalance());
        System.out.println("monthly interest = "+A.getMonthlyInterest());
        System.out.println("The account was created at "+A.getDateCreated());
        
        
    }
    
}
