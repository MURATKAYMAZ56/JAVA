package nl.hva.miw.datastructuren.tentamen.opdracht3.command;

public class BackwardCommand implements Command {

	public BackwardCommand() {
		super();
	}

	@Override
	public void doCommand() {
		System.out.println("Robot moves backward");
	}

	@Override
	public void undoCommand() {
		new ForwardCommand().doCommand();
	}
}
