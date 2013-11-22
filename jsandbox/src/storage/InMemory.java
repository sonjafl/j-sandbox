package storage;

import java.util.ArrayList;

import enteties.person;

public class InMemory implements storageInterface {
	
	private ArrayList<person> storage;
	
	@Override
	public person findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public person findByNumber(String number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public person create(String name, String number) {
		person p = new person(name, number);
		this.storage.add(p);
		return p;
	}

	@Override
	public ArrayList<person> showAll() {
		return this.storage;
	}

}
