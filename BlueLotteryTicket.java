package com.JavaPractice.Assignmnet.Java_Lang_Constructs;

import java.util.Scanner;

public class BlueLotteryTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 3 lottery ticket number displayed");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();
		BlueLotteryTicket obj=new BlueLotteryTicket();
		System.out.println("Pair sum is :"+obj.lotteryTicket(num1,num2,num3));
	}
	public int lotteryTicket(int a, int b, int c) {
	    int ab = a + b;
	    int bc = b + c;
	    int ac = a + c;	      
	    if(ab == 10 || bc == 10 || ac == 10)
	        return 10;	
	    else if(ab == bc + 10 || ab == ac + 10)
	        return 5;	  
	    else
	    return 0;
	}
	

}
