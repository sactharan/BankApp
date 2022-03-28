package data;

import java.util.ArrayList;

import business.CashierLogin;

public interface ICashierLogin {

	boolean add(CashierLogin l);
	boolean delete(String userID);
	boolean update(CashierLogin l);
	CashierLogin get(String userID);
	ArrayList<CashierLogin> getAll();
	
}
