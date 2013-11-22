package input;

import java.io.*;
import storage.InMemory;

public class Input {
	// String ui = null;
	// String ui = null;
	// String[] uiarrayshortpublic = new String[2];
	// public String[] uiarrayshort = new String[2];
	public String ui = null;
	public String uicommand = null;
	public String uinamenumber = null;
	public String uiname = null;
	public String uinumber = null;

	public String[] inputparser() {

		// open up standard input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your command: ");
		String[] uiarray = new String[3];
		// String[] namenumberarray = new String[2];
		// String[] uiarrayshort = new String[2];
		// String[] uiarraylong = new String[3];
		// String uicommand= null;
		// String uinamenumber= null;

		// read the username from the command-line; need to use try/catch with
		// the
		// readLine() method
		try {
			ui = br.readLine();
			ui = ui.toLowerCase();
			if ("show".equals(ui))// to avoid exception
			{
				ui = ui.concat(" ");
			}
			// String[] uiarray = new String[3];
			// uiarray=ui.split(" ",2);
			uicommand = ui.split(" ", 2)[0];
			uinamenumber = ui.split(" ", 2)[1];

			if (uinamenumber.contains(" "))// if both name and number are given
			{
				// String[] namenumberarray = new String[2];
				// namenumberarray=uinamenumber.split(" ",2);
				uiname = uinamenumber.split(" ", 2)[0];
				uinumber = uinamenumber.split(" ", 2)[1];
			} else // if only name is given
			{
				uiname = ui.split(" ", 2)[1];
				uinumber = null;
			}
			uiarray[0] = uicommand;
			uiarray[1] = uiname;
			uiarray[2] = uinumber;

			/*
			 * String[] parsedInput = new String[3]; parsedInput[0]=uicommand;
			 * parsedInput[1]=uiname; parsedInput[1]=uinumber;
			 */

			// uiarraylong=ui.split(" ",3);

			// uicommand=uiarray[0];
			// uinamenumber=uiarray[1];

		} catch (IOException ioe) {
			System.out.println("IO error trying to read your name!");
			System.exit(1);
		}

		System.out.println("uicommand " + uicommand + " uiname " + uiname
				+ " uinumber " + uinumber);
		// System.out.println("Your long inputarray is (" + uiarraylong[0]+", "+
		// uiarraylong[1]+", "+uiarraylong[2]+")");
		this.validcommand();
		return (uiarray);
	}

	public boolean validcommand() {
		System.out.println("start validcommand");
		String[] commandlist = { "create", "delete", "edit", "findbyName",
				"findByNumber", "show" };

		for (int i = 0; i < commandlist.length; i++) {
			if (commandlist[i].equals(uicommand)) {
				System.out.println("command " + commandlist[i] + "exists");
				return true;
			}
		}
		System.out.println("command does not exist");
		return false;// was passiert wenn hier false kommt?
	}

	public String getUicommand() {
		return uicommand;
	}

	public String getUiname() {
		return uiname;
	}

	public String getUinumber() {
		return uinumber;
	}
	
	
	
} // end of Input class

