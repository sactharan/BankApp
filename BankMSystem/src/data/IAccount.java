package data;

import java.util.ArrayList;

import business.Account;

public interface IAccount {
	boolean add(Account a);
	boolean delete(int accountID);
	boolean update(Account a);
	Account get(int accountID);
	ArrayList<Account> getAll();
}
