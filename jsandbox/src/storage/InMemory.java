package storage;
//import jsandbox.src.entities.person;

import java.util.ArrayList;
import entities.person;

public class InMemory implements storageInterface {
	
	private ArrayList<person> personList= new ArrayList<person>();
	
	@Override
	public person find(String name) {
		if (name==null)
		{
		 System.out.println("Cannot findByName entry without name");
		 return null;
		}
		
		for (person p : this.personList) {
			if (p.getName().equals(name)|p.getNumber().equals(name)) {
				return p;
			}
		}
		return null;
	}

	/*@Override
	public person findByNumber(String number) {
		if (number==null)
		{
		 System.out.println("Cannot findByNumber without number");
		 return null;
		}
		for (person p : this.personList) {
			if (p.getNumber().equals(number)) {
				return p;
			}
		}
		return null;
	}*/

	@Override
	public boolean delete(String name) {
		if (name==null)
		{
		 System.out.println("Cannot delete entry without name");
		 return false;
		}
		for (person p : this.personList){
			if (p.getName().equals(name)){
				personList.remove(p);
				return true;
			}
		}
		return false;
	}

	@Override
	public person create(String name,String number) {
		if (number==null)
			{
			 System.out.println("Cannot create entry without number");
			 return null;
			}
		person p = new person(name, number);		
		this.personList.add(p);
		return p;
	}

	@Override
	public ArrayList<person> show() {
		return this.personList;
	}

}
