import java.util.ArrayList;

import enteties.person;
import input.Input;
import storage.InMemory;


class Addressbook {
	
	private InMemory storage;
	private Input ui;
	
	public Input getUi() {
		return ui;
	}

	public Addressbook(){
		this.storage = new InMemory();
		this.ui = new Input();
	}
	
	 public void welcomeScreen() {
     	System.out.println("Welcome to your adressbook\nChoose your action");
     	System.out.println("create(name+number)\ndelete(name)\nfindByName(name)\nfindByNumber(number)\nShow()");
     }
	 
	public void startProcess() {
		
		
		System.out.println("start startProcess");
		
		ui.inputparser();
		
		if ("create".equals(ui.getUicommand())) {
			storage.create(ui.getUiname(), ui.getUinumber());
		}
		if ("delete".equals(ui.getUicommand())) {

		}
		if ("edit".equals(ui.getUicommand())) {

		}
		if ("findbyname".equals(ui.getUicommand())) {

		}
		if ("findbynumbers".equals(ui.getUicommand())) {

		}
		if ("show".equals(ui.getUicommand())) {
			ArrayList<person> persons = storage.show();
			for (person p : persons){
				System.out.println(p.toString());
			}
			
		}

	}
	
}
