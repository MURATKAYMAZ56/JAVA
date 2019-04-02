package nl.hva.miw.datastructuren.tentamen.opdracht3.command;

public class ForwardCommand implements Command {
	
	public ForwardCommand() {
		super();
	}

	@Override
	public void doCommand() {
		System.out.println("Robot moves forward");
	}

	@Override
	public void undoCommand() {
		new BackwardCommand().doCommand();
	}
}
