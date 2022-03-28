package data;

import java.util.ArrayList;


import business.Cashier;

public interface ICashier {
	boolean add(Cashier c);
	boolean delete(int cashierID);
	boolean update(Cashier c);
	Cashier get(int cashierID);
	ArrayList<Cashier> getAll();
}