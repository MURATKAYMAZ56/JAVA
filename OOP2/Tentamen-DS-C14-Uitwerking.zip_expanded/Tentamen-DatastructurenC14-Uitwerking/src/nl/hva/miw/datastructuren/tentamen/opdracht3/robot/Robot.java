package nl.hva.miw.datastructuren.tentamen.opdracht3.robot;

import java.util.Stack;

import nl.hva.miw.datastructuren.tentamen.opdracht3.command.Command;

public class Robot {
	private Stack<Command> history = new Stack<>();
	private Stack<Command> redoList = new Stack<>();

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
		c.doCommand();
		
		history.push( c );

		redoList.clear();
	}
	
	/**
	 * Let the robot undo the previous command. Can be called repeatedly and
	 * will undo previous commands, if available.
	 */
	public void undoLastCommand() {
		// Fill in your answer
		System.out.println("Undo command not yet supported!");
        if ( history.isEmpty() ) {
            System.out.println("No command to undo");
        } else {
            Command c = history.pop();
            c.undoCommand();

            redoList.push(c);
        }
	}

	/**
	 * Let the robot redo a previously undone command. Can be called repeatedly and
	 * will redo commands, if available.
	 */
	public void redoUndoneCommand() {
		// Fill in your answer
		System.out.println("Redo command not yet supported!");
		
		if ( redoList.isEmpty() ) {
            System.out.println("No command to redo");
        } else {
            Command c = redoList.pop();
            c.doCommand();

            history.push(c);
        }
	}

	public void shutdownRobot() {
		System.out.println("Robot shutting down ... ");
	}
}
