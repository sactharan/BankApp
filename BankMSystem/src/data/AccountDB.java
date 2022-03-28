package data;

import java.util.ArrayList;

import java.io.*;
import java.util.Scanner;
import java.sql.Date;
import javax.swing.JOptionPane;

import business.Account;


public class AccountDB implements IAccount{
	private File myObj;
	
	public AccountDB() {
		myObj=new File("D:\\hd51\\account.txt");
	}

	@Override
	public boolean add(Account a) {
		// TODO Auto-generated method stub
		try {
			 FileWriter fw=new FileWriter(myObj,true);
			 String line=a.getAccountID()+" "+a.getCustomerID()+" "+a.getCustomerName()+" "+a.getCustomerAddress()+" "+a.getCustomerPhone()+" "+a.getBranch()+" "+a.getAccountType()+" "+a.getBalance()+"\n";
			 fw.append(line);
			 fw.close();
			 return true;
			}catch(IOException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				return false;
			}
	}

	@Override
	public boolean delete(int accountID) {
		// TODO Auto-generated method stub
		try {
			ArrayList<Account> accountList=getAll();
			
			FileWriter fw1=new FileWriter(myObj);
			fw1.write("");
			fw1.close();
			
			for(Account a:accountList) {
				if(a.getAccountID()==accountID) {
					accountList.remove(a);					
					break;
				}
			}
			
			for(Account b1: accountList) {
				add(b1);
			}
			
			return true;
		 }catch(Exception e) {
			 JOptionPane.showMessageDialog(null, e.getMessage());
			 return false;
		 }
	}

	@Override
	public boolean update(Account a) {
		// TODO Auto-generated method stub
		try {
            ArrayList<Account> accountList=getAll();
			
			FileWriter fw1=new FileWriter(myObj);
			fw1.write("");
			fw1.close();
			
			for(Account b1:accountList) {
				if(b1.getAccountID()==a.getAccountID()) {
					accountList.remove(b1);
					accountList.add(a);
					break;
				}
			}
			
			for(Account b2: accountList) {
				add(b2);
			}
			
			return true;
		 }catch(Exception e) {
			 JOptionPane.showMessageDialog(null, e.getMessage());
			 return false;
		 }
	}

	@Override
	public Account get(int accountID) {
		// TODO Auto-generated method stub
		ArrayList<Account> accountList=getAll();
		for(Account a:accountList) {
			if(a.getAccountID()==accountID) {
				return a;
			}
		}
		
		return null;
	}
	
	@Override
	public ArrayList<Account> getAll() {
		// TODO Auto-generated method stub
		ArrayList<Account> accountList=new ArrayList<Account>();
		try {
		Scanner sc=new Scanner(myObj);
		while(sc.hasNextLine()) {
			String line=sc.nextLine();
			String[]  arr=line.split(" ");
			int accountID=Integer.valueOf(arr[0]);
			String customerID=arr[1];
			String customerName=arr[2];
			String customerAddress=arr[3];
			String customerPhone=arr[4];
			String branch=arr[5];
			String accountType=arr[6];
			Double balance=Double.valueOf(arr[7]);
			Account a=new Account(accountID, customerID, customerName,customerAddress,customerPhone,branch, accountType, balance);
			accountList.add(a);
		}
		sc.close();
		return accountList;		
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return null;
		}		
	}	
}
