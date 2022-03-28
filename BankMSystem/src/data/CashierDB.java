package data;

import java.util.ArrayList;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

import business.Cashier;

import java.sql.Date;

public class CashierDB implements ICashier{
	private ArrayList<Cashier>  cashierList;
	private File myObj;
	
	public CashierDB() {
		//bookList=new ArrayList<Book>();
		myObj=new File("D:\\hd51\\cashier.txt");
		
	}

	@Override
	public boolean add(Cashier c) {
		try {
		 FileWriter fw=new FileWriter(myObj,true);
		 String line=c.getCashierID()+" "+c.getCashierName()+" "+c.getCashierPassword()+" "+c.getCashierUname()+" "+c.getCashierRegdate()+" "+c.getCashierBranch()+"\n";
		 fw.append(line);
		 fw.close();
		 return true;
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return false;
		}
	}

	
	@Override
	public boolean delete(int cashierID) {
		try {
			ArrayList<Cashier> cashierList=getAll();
			
			FileWriter fw1=new FileWriter(myObj);
			fw1.write("");
			fw1.close();
			
			for(Cashier cr:cashierList) {
				if(cr.getCashierID()==cashierID) {
					cashierList.remove(cr);					
					break;
				}
			}
			
			for(Cashier c1: cashierList) {
				add(c1);
			}
			
			return true;
		 }catch(Exception e) {
			 JOptionPane.showMessageDialog(null, e.getMessage());
			 return false;
		 }
	}

	@Override
	public boolean update(Cashier c) {
		// TODO Auto-generated method stub	
	try {
		ArrayList<Cashier> cashierList=getAll();
		
		FileWriter fw1=new FileWriter(myObj);
		fw1.write("");
		fw1.close();
		
		for(Cashier cr:cashierList) {
			if(cr.getCashierID()==c.getCashierID()) {
				cashierList.remove(cr);
				cashierList.add(c);
				break;
			}
		}
		
		for(Cashier c1: cashierList) {
			add(c1);
		}
		
		return true;
	 }catch(Exception e) {
		 JOptionPane.showMessageDialog(null, e.getMessage());
		 return false;
	 }
	}

	@Override
	public Cashier get(int cashierID) {
		// TODO Auto-generated method stub		
		ArrayList<Cashier> cashierList=getAll();
		for(Cashier c:cashierList) {
			if(c.getCashierID()==cashierID) {
				return c;
			}
		}
		
		return null;
	}

	@Override
	public ArrayList<Cashier> getAll() {
		// TODO Auto-generated method stub
		ArrayList<Cashier> cashierList=new ArrayList<Cashier>();
		try {
		Scanner sc=new Scanner(myObj);
		while(sc.hasNextLine()) {
			String line=sc.nextLine();
			String[]  arr=line.split(" ");
			int cashierID=Integer.valueOf(arr[0]);
			String cashierName=arr[1];
			String cashierPw=arr[2];
			String cashierUname=arr[3];
			Date cashierRegdate=Date.valueOf(arr[4]);
			String cashierBranch=arr[5];
			Cashier c=new Cashier(cashierID, cashierName, cashierPw, cashierUname, cashierRegdate, cashierBranch);
			cashierList.add(c);
		}
		sc.close();
		return cashierList;		
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return null;
		}		
		
	}


}

