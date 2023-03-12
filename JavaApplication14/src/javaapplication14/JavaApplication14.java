/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

import  java.util.Scanner;

public class JavaApplication14 {

    static int balance = 5000;
    
    static void balanceCheck(){
        System.out.println("Your current balance is Php "+balance);
}
    
    public static void main(String[] args) {
        balanceCheck();
        
    }
    public static void Deposit() 
	{
		char Again;
		do {
		Scanner deposit = new Scanner(System.in);
		System.out.print("Deposit Here: ");
		double amount = deposit.nextDouble();
		double charge =( amount-18);
		double balance =0;
		balance =balance + charge;
		System.out.print("you have succesfully deposit" +amount+"\n");
		System.out.println("your balance "+charge+"\n");
		deposit.nextLine();
		//repeat lang deposit need solution para ma save balance
		 System.out.print("Deposit again? (Y/N) ");
         Again = deposit.nextLine().charAt(0);
     } while (Again == 'y' || Again == 'Y');
		//balik sa selection
	}
}
