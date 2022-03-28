package business;

import java.sql.Date;

public class Cashier {
	  private int cashierID;
	  private String cashierName;
	  private Date cashierRegdate;
	  private String cashierUname;
	  private String cashierPw;
	  private String cashierBranch;
	  
	  public Cashier() {
			// TODO Auto-generated constructor stub
		  }
		  
		  public Cashier(int cashierID,String cashierName, String cashierPw, String cashierUname,Date cashierRegdate, String cashierBranch) {
			this.cashierID=cashierID;
			this.cashierName=cashierName;
			this.cashierPw=cashierPw;
			this.cashierUname=cashierUname;
			this.cashierRegdate=cashierRegdate;
			this.cashierBranch=cashierBranch;
		  }
		  
		  public void setCashierID(int cashierID) {
			this.cashierID = cashierID;
		  }
		  
		  public int getCashierID() {
			return cashierID;
		 }
		  
		  public void setCashierName(String cashierName) {
				this.cashierName = cashierName;
			  }
			  
		  public String getCashierName() {
				return cashierName;
			 }
		  
		  public void setCashierPassword(String cashierPw) {
			  this.cashierPw=cashierPw;		 
			  }
		  public String getCashierPassword() {
				return cashierPw;
			 }
		  
		
		  public void setCashierUname(String cashierUname) {
			  this.cashierUname=cashierUname;		 
			  }
		  public String getCashierUname() {
				return cashierUname;
			 }
		  

		  public void setCashierRegdate(Date cashierRegdate) {
			  this.cashierRegdate=cashierRegdate;		 
			  }
		  
		  public Date getCashierRegdate() {
			  return cashierRegdate;
		  }
		  public void setCashierBranch(String cashierBranch) {
			  this.cashierBranch=cashierBranch;		 
			  }
		  
		  public String  getCashierBranch() {
			  return cashierBranch;
		  }
			  
			
		  
	

}
