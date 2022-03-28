package data;
import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import business.CashierLogin;



public class CashierLoginDB implements ICashierLogin {
	private File myObj;
	
	public CashierLoginDB() {		
		 myObj=new File("D:\\hd51\\cashierlogin.txt");
	}
	
	
	public boolean add(CashierLogin l) {
		// TODO Auto-generated method stub
		try {
			 FileWriter fw=new FileWriter(myObj,true);
			 String line=l.getUserID()+" "+l.getPassword()+"\n";
			 fw.append(line);
			 fw.close();
			 return true;
			}catch(IOException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				return false;
			}
	}

	public boolean delete(String userID) {
		// TODO Auto-generated method stub
		try {
			ArrayList<CashierLogin> loginList=getAll();
			
			FileWriter fw1=new FileWriter(myObj);
			fw1.write("");
			fw1.close();
			
			for(CashierLogin log:loginList) {
				if(log.getUserID().equals(userID)) {
					loginList.remove(log);					
					break;
				}
			}
			
			for(CashierLogin log1: loginList) {
				add(log1);
			}
			
			return true;
		 }catch(Exception e) {
			 JOptionPane.showMessageDialog(null, e.getMessage());
			 return false;
		 }
	}

	public boolean update(CashierLogin l) {
		// TODO Auto-generated method stub
		try {
			ArrayList<CashierLogin> loginList=getAll();
			
			FileWriter fw1=new FileWriter(myObj);
			fw1.write("");
			fw1.close();
			
			for(CashierLogin log:loginList) {
				if(log.getUserID().equals(l.getUserID())) {
					loginList.remove(log);
					loginList.add(l);
					break;
				}
			}
			
			for(CashierLogin log1: loginList) {
				add(log1);
			}
			
			return true;
		 }catch(Exception e) {
			 JOptionPane.showMessageDialog(null, e.getMessage());
			 return false;
		 }
	}

	public CashierLogin get(String userID) {
		// TODO Auto-generated method stub
		ArrayList<CashierLogin> loginList=getAll();
		for(CashierLogin log:loginList) {			
			if(log.getUserID().equals(userID)) {				
				return log;
			}
		}
		
		return null;
	}

	public ArrayList<CashierLogin> getAll() {
		// TODO Auto-generated method stub
		ArrayList<CashierLogin> loginList=new ArrayList<CashierLogin>();
		try {
		Scanner sc=new Scanner(myObj);
		while(sc.hasNextLine()) {
			String line=sc.nextLine();
			String[]  arr=line.split(" ");			
			String userID=arr[0];
			String password=arr[1];
			CashierLogin log=new CashierLogin(userID, password);			
			loginList.add(log);
		}
		sc.close();
		return loginList;		
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return null;
		}		
	}

}
