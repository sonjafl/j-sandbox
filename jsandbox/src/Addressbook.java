import java.util.ArrayList;

import entities.person;
import input.Input;
import storage.InMemory;
import input.InputParser;

class Addressbook {
	
	private InMemory storage;
	private Input ui;
	
	public Addressbook(){
		this.storage = new InMemory();
		this.ui = new Input();
	}
	
	 public void welcomeScreen() {
     	System.out.println("Welcome to your adressbook\nChoose your action");
     	System.out.println("create(name+number)\ndelete(name)\nfindByName(name)\nfindByNumber(number)\nShow()");
     }
	 
	public void startProcess() {

		this.ui.read();
		
		
		if (ui.getParser().isCommandValidated()==true) {
			System.out.println("start startProcess");

			if (InputParser.Commands.CREATE.name().equals(
					ui.getParser().getUicommand())) {
				storage.create(ui.getParser().getUinameornumber(), ui
						.getParser().getUinumber());
			}
			if (InputParser.Commands.DELETE.name().equals(
					ui.getParser().getUicommand())) {
				storage.delete(ui.getParser().getUinameornumber());
			}

			if (InputParser.Commands.FIND.name().equals(
					ui.getParser().getUicommand())) {
				person p = this.storage
						.find(ui.getParser().getUinameornumber());
				if (p != null) {
					System.out.println(p.toString());
				} else {
					System.out.println("Name or Number not found");
				}
			}

			if (InputParser.Commands.SHOW.name().equals(
					ui.getParser().getUicommand())) {
				ArrayList<person> persons = this.storage.show();
				for (person p : persons) {
					System.out.println(p.toString());
				}
			}

		}
	}

}
