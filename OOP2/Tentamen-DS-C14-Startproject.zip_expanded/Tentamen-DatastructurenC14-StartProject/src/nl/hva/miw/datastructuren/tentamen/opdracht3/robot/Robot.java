package nl.hva.miw.datastructuren.tentamen.opdracht3.robot;

import java.util.LinkedList;

import nl.hva.miw.datastructuren.tentamen.opdracht3.command.Command;

public class Robot {
	
	private LinkedList<Command> history = new LinkedList<>();
	
	private Command undoLastCommand = null;
	
	public Robot() {
		super();
	}
	
	public void startRobot() {
		System.out.println("Robot started ... ");
	}
	
	/**
	 * Let the robot perform a command
	 * 
	 * @param c
	 */
	public void performCommand( Command c ) {
		history.add(c);
		c.doCommand();
	}
	
	/**
	 * Let the robot undo the previous command. Can be called repeatedly and
	 * will undo previous commands, if available.
	 */
	public void undoLastCommand() {
		undoLastCommand = history.pollLast(); // get last cmd and remove it & assign to undoLastCommand
		if(undoLastCommand != null) {
			undoLastCommand.undoCommand();
		}
	}

	/**
	 * Let the robot redo a previously undone command. Can be called repeatedly and
	 * will redo commands, if available.
	 */
	public void redoUndoneCommand() {
		if(undoLastCommand != null) { // if there is an assigned undoLastCommand, then add to history and execute it
			history.add(undoLastCommand);
			history.peekLast().doCommand();
		}
	}

	public void shutdownRobot() {
		System.out.println("Robot shutting down ... ");
	}
}
