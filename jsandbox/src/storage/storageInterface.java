package storage;

import java.util.ArrayList;
import enteties.person;


public interface storageInterface {
	
	public person findByName(String name);
	
	public person findByNumber(String number);
	
	public boolean delete(String name);
	
	public person create(String name, String number);
	
	public ArrayList<person> show();
	
}
