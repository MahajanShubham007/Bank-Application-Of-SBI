package com.BikkadIT.bankApplication.service;

import java.util.Scanner;

import com.BikkadIT.bankApplication.model.Account;

public class ServiceImpl implements Service {

	Scanner sc=new Scanner(System.in);
	Account acc= new Account();
	
	@Override
	public void AccountCreate() {
	
	
	
		
		
	System.out.println("Enter Your Account Number");
	long accno=sc.nextLong();
	acc.setAccno(accno);
	
	
	System.out.println("Enter Your First Name");
	String fname=sc.next();
	acc.setFistName(fname);
	
	System.out.println("Enter Your Last Name");
	String lname=sc.next();
	acc.setLastName(lname);
	
	System.out.println("Enter Your Email ID");
	String mail=sc.next();
	acc.setEmail(mail);
	
	System.out.println("Enter Your Address");
	String address=sc.next();
	acc.setAddress(address);
	
	System.out.println("Enter Your Phone Number");
	String number=sc.next();
	acc.setPhone(number);
	
	System.out.println("Enter Amount you Want Deposite");
	double balance=sc.nextDouble();
	acc.setBalance(balance);
	
	System.out.println("Your Total Balance is ="+balance);
	
	System.out.println("Account Created Successfully");
		
		
	}

	@Override
	public void ViewAccountDetails() {
		
		System.out.println("Enter Your Account Number");
		int account=sc.nextInt();
		
		if(acc.getAccno()==account) {
		
		System.out.println("Your Account Number is "+acc.getAccno());	
		System.out.println("Your First Name is "+acc.getFistName());
		System.out.println("Your Last Name is "+acc.getLastName());	
		System.out.println("Your Email Name is "+acc.getEmail());	
		System.out.println("Your Address  is "+acc.getAddress());	
		System.out.println("Your Phone Number is "+acc.getPhone());	
		System.out.println("Your Balance is is "+acc.getBalance());	
			
	}else
	{
		System.out.println("Invalid Account Number");
	}
	}

	@Override
	public void Deposit() {
		System.out.println("Enter Acount Number");
		 long useracc=sc.nextLong();
		if (acc.getAccno()==useracc) {
			
			System.out.println("Ener Your Amount");
			double creaditamt=sc.nextDouble();
			double bala;
			bala= acc.getBalance()+creaditamt;
			acc.setBalance(bala);
			System.out.println("Successfully Deposit \nYour "
					+ "Total Balance is ="+acc.getBalance());
			
			}else {
			System.out.println("Create Account First");
		}
		
		}

	@Override
	public void Withdraw() {
		System.out.println("Enter Your Account Number");
		long useracc=sc.nextLong();
		if (useracc==acc.getAccno()) {
			System.out.println("Enter Your Withdrawal Amount");
			double with=sc.nextDouble();
			double total;
			
			total=acc.getBalance()-with;
			acc.setBalance(total);
			System.out.println("Withdrawal Successfully\nYou Total Balance Is ="+acc.getBalance());
			
		}else {
			System.out.println("Invalid Account Number");
		}
		
	}

	@Override
	public void update() {
		System.out.println("Enter Your account Number");
		
		
		long urseacc=sc.nextLong();
		if(urseacc==acc.getAccno()) {
			
			boolean flag=true;
			while(flag) {
			System.out.println("press 1 for update name");
			System.out.println("press 2 for update First Name");
			System.out.println("press 3 for update address ");
			System.out.println("press 4 for update Email");
			System.out.println("press 5 for update phone");
			System.out.println("pess 6 for exit");
			
			
			int ch=sc.nextInt();
			switch (ch) {
			case 1: System.out.println("you want to update your first name");
			       String fname=sc.next();
			       acc.setFistName(fname);
			       System.out.println("First name changed successfully");
			       break;
			       
			case 2:System.out.println("you want to update your last name");
			       String lname=sc.next();
			       acc.setLastName(lname);
			       System.out.println("Last name changed successfully");
			       break;
			       
			case 3:System.out.println("you want to update your address");
			       String add=sc.next();
			       acc.setAddress(add);
			       System.out.println("Address changed successfully");
			       break;
			       
			case 4: System.out.println("you want to update Email");
			       String mail=sc.next();
			       acc.setEmail(mail);
			       System.out.println("Email changed successfully");
			       break;
			       
			case 5:System.out.println("You want to update phone number");
			     String no=sc.next();
			     acc.setPhone(no);
			     System.out.println("phone number changed successfully");
			     break;
			     
			case 6: flag=false;
			      break;
			      
			default :System.out.println("thanks you");
			
			
			}
		}
		
		}else {
			System.out.println("invalid account number");
		}
	}
}

