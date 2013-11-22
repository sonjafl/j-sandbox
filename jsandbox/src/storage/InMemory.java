package storage;
//import jsandbox.src.entities.person;

import java.util.ArrayList;
import java.util.Iterator;

import input.Input;

import enteties.person;

public class InMemory implements storageInterface {
	
	private ArrayList<person> personList= new ArrayList<person>();
	
	@Override
	public person findByName(String name) {
		
		//findByName.name=findByName;
	/*	for (person person:this.storage)
			if (person.name=name)
			{
				System.out.println(toString());
			}
			else
			{
				System.out.println("Person does not exist in adressbook");
			}
	*/		
			// TODO Auto-generated method stub
		return null;
	}

	@Override
	public person findByNumber(String number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String name) {
		/*for (person in storage)
		 * if (person.name=name)
		 * 		{
		 * 			delete person from storage;
		 * 		}
		 */
		
		/*for (int i=0;i<this.storage.size;i++)
		 {
			 if (this.storage[i].name.equals(name))
				 {
			 		System.out.println("person with name "+name +" found and will be deleted");
			 		return true;
				 }
		 }
		 */
		return false;
	}

	@Override
	public person create(String name,String number) {
		if (number==null)
			{
			 System.out.println("Cannot create entry without number");
			 //TODO:programm anhalten
			}
		System.out.println("start process create");
		person p = new person(name, number);
		System.out.println("storage= "+this.personList);
		
		this.personList.add(p);
		System.out.println("person added");
		System.out.println("storage= "+this.personList);
		return p;//wieso?
	}

	@Override
	public ArrayList<person> show() {
		return this.personList;
	}

}
