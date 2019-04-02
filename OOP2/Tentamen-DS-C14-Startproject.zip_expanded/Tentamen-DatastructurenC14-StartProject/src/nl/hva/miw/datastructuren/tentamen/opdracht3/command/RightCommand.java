package nl.hva.miw.datastructuren.tentamen.opdracht3.command;

import nl.hva.miw.datastructuren.tentamen.opdracht3.robot.Robot;

public class RightCommand extends Robot implements Command {

	@Override
	public void doCommand() {
		System.out.println("robotmoves right");

	}

	@Override
	public void undoCommand() {
		new LeftCommand().doCommand();

	}

}
