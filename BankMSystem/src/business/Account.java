package business;

import java.sql.Date;


public class Account {
	 private int accountID;
	 private String customerID;
	 private String customerName;
	 private String customerAddress;
	 private String customerPhone;
	 private String branch;
	 private String accountType;
	 private Double balance;
	  
	  public Account() {
			// TODO Auto-generated constructor stub
		  }
		  
		  public Account(int accountID,String customerID,String customerName, String customerAddress, String customerPhone,String branch,String accountType,Double balance) {
			this.accountID=accountID;
			this.customerID=customerID;
			this.customerName=customerName;
			this.customerAddress=customerAddress;
			this.customerPhone=customerPhone;
			this.branch=branch;
			this.accountType=accountType;
			this.balance=balance;
		  }
		  
		  public void setAccountID(int accountID) {
				this.accountID = accountID;
			  }
			  
			  public int getAccountID() {
				return accountID;
			 }
			  
			  
	      public void setCustomerID(String customerID) {
					this.customerID = customerID;
				  }
				  
			 public String getCustomerID() {
					return customerID;
				 }
	    public void setCustomerName(String customerName) {
					this.customerName = customerName;
				  }
				  
		   public String getCustomerName() {
					return customerName;
				 }
		   public void setCustomerAddress(String customerAddress) {
				this.customerAddress = customerAddress;
			  }
			  
	   public String getCustomerAddress() {
				return customerAddress;
			 }
	   public void setCustomerPhone(String customerPhone) {
			this.customerPhone = customerPhone;
		  }
		  
  public String getCustomerPhone() {
			return customerPhone;
		 }
  
  public void setBranch(String branch) {
		this.branch = branch;
	  }
	  
public String getBranch() {
		return branch;
	 }
		      
		public void setAccountType(String accountType) {
				this.accountType = accountType;
			  }
			  
	        public String getAccountType() {
				return accountType;
			 }	  
	        
	        public void setBalance(Double balance) {
				this.balance = balance;
			  }
			  
	        public Double getBalance() {
				return balance;
			 }	
}
