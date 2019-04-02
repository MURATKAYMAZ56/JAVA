package nl.hva.miw.datastructuren.tentamen.opdracht3.command;

public class RightCommand implements Command {
	
	public RightCommand() {
		super();
	}

	@Override
	public void doCommand() {
		System.out.println("Robot moves right");
	}

	@Override
	public void undoCommand() {
		new LeftCommand().doCommand();
	}
}
