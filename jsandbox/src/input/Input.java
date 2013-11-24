package input;

import java.io.*;
import input.InputParser;

public class Input {

	private InputParser parser;

	public InputParser getParser() {
		return parser;
	}

	public Input() {
		parser = new InputParser();
	}

	public void read() {
		String ui = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your command: ");
		try {
			ui = br.readLine();
		} catch (IOException ioe) {
			System.out.println("IO error trying to read your name!");
			System.exit(1);
		}
		parser.parse(ui);
	}

}

