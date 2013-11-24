package storage;

import java.util.ArrayList;

import entities.person;


public interface storageInterface {
	
	public person find(String name);
	
	//public person findByNumber(String number);
	
	public boolean delete(String name);
	
	public person create(String name, String number);
	
	public ArrayList<person> show();
	
}
