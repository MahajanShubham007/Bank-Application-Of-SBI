package com.BikkadIT.bankApplication.controller;

import java.util.Scanner;

import com.BikkadIT.bankApplication.service.ServiceImpl;

public class Controller {
	
	
		public static void main(String[] args) {
			
		ServiceImpl service=new ServiceImpl();
		boolean flag=true;
		while(flag) {
		
		System.out.println("Welcome to SBI");
		
		System.out.println("press 1 for Create Account");
		System.out.println("press 2 for View Account Details");
		System.out.println("press 3 for Deposite Money");
		System.out.println("press 4 for Withdrawal Money");
		System.out.println("press 5 for update");
		System.out.println("press 6 for Exit");
		
		Scanner sc=new Scanner(System.in);
		int choise=sc.nextInt();
		
		switch (choise) {
		
		case 1:
		       service.AccountCreate();
		break;
		
		case 2:service.ViewAccountDetails();
		break;
		
		case 3:service.Deposit();
		break;
		
		case 4:service.Withdraw();
		break;
		
		case 5:service.update();
		
		case 6: flag=false;
			break;
		default :
		{
			System.out.println("Invalid Choise");
		}
		
		
		
		
		}
		
	}
}
}