package input;

public class InputParser {

	private String uicommand = null;
	private String uinamenumber = null;
	private String uinameornumber = null;
	private String uinumber = null;
	private boolean commandValidated;

	public enum Commands {
		CREATE, DELETE, FIND, SHOW
	};

	public void parse(String ui) {

		if (!ui.contains(" "))// if only command is given
		{
			uicommand = ui;
			uinameornumber = null;
			uinumber = null;
		}

		else // if more than command is given
		{
			uicommand = ui.split(" ", 2)[0];
			uinamenumber = ui.split(" ", 2)[1];

			if (!uinamenumber.contains(" "))// if more than command is given;
											// second string assumed to be a
											// name
			{
				uinameornumber = uinamenumber;
				uinumber = null;

			} else // if command, name and number are given
			{
				uinameornumber = uinamenumber.split(" ", 2)[0];
				uinumber = uinamenumber.split(" ", 2)[1];
			}

		}
		
		uicommand = uicommand.toUpperCase();
		validcommand(uicommand);

	}

	public boolean validcommand(String command) {
		System.out.println("start validcommand");
		
		
		
		for (Commands c : Commands.values()) {
			if (c.name().equals(command)) {
				System.out.println("command " + c.name() + " exists");
				this.commandValidated = true;
				return true;
			}
		}

		System.out.println("command does not exist " + command);
		this.commandValidated = false;
		return false;

	}

	public String getUinamenumber() {
		return uinamenumber;
	}

	public boolean isCommandValidated() {
		return commandValidated;
	}

	public String getUicommand() {
		return uicommand;
	}

	public String getUinameornumber() {
		return uinameornumber;
	}

	public String getUinumber() {
		return uinumber;
	}

}
