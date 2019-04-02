package nl.hva.miw.datastructuren.tentamen.opdracht3.command;

public class LeftCommand implements Command {
	
	public LeftCommand() {
		super();
	}

	@Override
	public void doCommand() {
		System.out.println("Robot moves left");
	}

	@Override
	public void undoCommand() {
		new RightCommand().doCommand();
	}
}
