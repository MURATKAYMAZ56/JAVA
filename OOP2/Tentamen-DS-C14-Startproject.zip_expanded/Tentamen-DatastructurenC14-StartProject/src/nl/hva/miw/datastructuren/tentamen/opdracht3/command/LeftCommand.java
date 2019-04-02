package nl.hva.miw.datastructuren.tentamen.opdracht3.command;

import nl.hva.miw.datastructuren.tentamen.opdracht3.robot.Robot;

public class LeftCommand extends Robot implements Command {

	@Override
	public void doCommand() {
		System.out.println("robot moves left");
		
	}

	@Override
	public void undoCommand() {
		new RightCommand().doCommand();
		
	}

}
