package nl.hva.miw.datastructuren.tentamen.opdracht3.robot;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import nl.hva.miw.datastructuren.tentamen.opdracht3.command.BackwardCommand;
import nl.hva.miw.datastructuren.tentamen.opdracht3.command.Command;
import nl.hva.miw.datastructuren.tentamen.opdracht3.command.ForwardCommand;
import nl.hva.miw.datastructuren.tentamen.opdracht3.command.LeftCommand;
import nl.hva.miw.datastructuren.tentamen.opdracht3.command.RightCommand;

public class RobotLauncher {
	// Valid Commands
	private static final String FORWARD = "f";
	private static final String BACKWARD = "b";
	private static final String LEFT = "l";
	private static final String RIGHT = "r";

	// Special Commands
	private static final String UNDO = "u";
	private static final String REDO = "R";
	private static final String QUIT = "q";

	// CommandoMap
	private Map<String, Command> commandMap = new HashMap<>();

	private Robot robot = new Robot();

	public RobotLauncher() {
		initCommandMap();
	}

	private void initCommandMap() {
		commandMap.put(FORWARD, new ForwardCommand());
		commandMap.put(BACKWARD, new BackwardCommand());
		commandMap.put(LEFT, new LeftCommand());
		commandMap.put(RIGHT, new RightCommand());
	}

	private void run() {
		robot.startRobot();

		readCommands();

		robot.shutdownRobot();
	}

	private void readCommands() {
		System.out.println("Mogelijke commando's: f(orward), b(ack), l(eft), r(ight), u(ndo), R(edo), q(uit)): ");

		Scanner scanner = new Scanner(System.in);
		boolean stop = false;

		while (!stop) {
			String c = getCommandFromUser(scanner);

			if (c.equals(QUIT)) {
				stop = true;
				continue;
			}

			doCommando(c);
		}
	}

	/**
	 * Let the robot do the command. Or the undo or redo, if requested.
	 * 
	 * @param c, a valid command or undo.
	 */
	private void doCommando(String c) {
		if (c.equals(UNDO)) {
			robot.undoLastCommand();
		} else if (c.equals(REDO)) {
			robot.redoUndoneCommand();
		} else {
			Command cmd = commandMap.get(c);

			robot.performCommand(cmd);
		}
	}

	private String getCommandFromUser(Scanner scanner) {
		boolean correctAnswer = false;
		String answer = "";

		while (!correctAnswer) {
			System.out.print("Geef commando ( f, b, l, r, u, R, q): ");
			answer = scanner.next();

			if (checkAnswer(answer))
				correctAnswer = true;
		}

		return answer;
	}

	/**
	 * Check whether the answer is a valid Command or one of the three special
	 * commands "Undo", "Redo", or "Quit".
	 * 
	 * @param answer
	 * @return true: valid answer, false otherwise
	 */
	private boolean checkAnswer(String answer) {
		switch (answer) {
		case UNDO:

		case REDO:
		case QUIT:
			return true;
		default:
			return commandMap.containsKey(answer);
		}
	}

	public static void main(String[] args) {
		new RobotLauncher().run();
	}

}