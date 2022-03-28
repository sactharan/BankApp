package business;

public class CashierLogin {
	
	private String userID;
	private String password;
	
	public CashierLogin() {
		// TODO Auto-generated constructor stub
	}
	
	public CashierLogin(String userID, String password) {
		this.userID=userID;
		this.password=password;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

}
