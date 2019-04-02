package BestSeven;

import java.util.Scanner;

public class BestSeven {

	static int[] team1Array = new int[7];
	static int[] team2Array = new int[7];
	// int matchNumber=0;
	static int team1Wins = 0;
	static int team2Wins = 0;
	static String team1, team2;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Name of Team 1: ");
		team1 = input.nextLine();
		System.out.print("Name of Team 2: ");
		team2 = input.nextLine();

		for (int i = 0; i < 7; i++) {
			if (team1Wins == 4 || team2Wins == 4) {
				break;

			}
			gameRecord(input, (i));

		}

		printRecords();

	}

	static void printRecords() {
		System.out.println("Total played games: " + (team1Wins + team2Wins));
		if (team1Wins > team2Wins) {
			System.out.println(team1 + " wins againts " + team2 + "  " + team1Wins + " - " + team2Wins);
		} else {
			System.out.println(team2 + " wins againts " + team1 + "  " + team2Wins + " - " + team1Wins);
		}

		for (int i = 0; i < (team1Wins + team2Wins); i++) {
			System.out.println(
					"Game " + (i + 1) + " : " + team1 + " -" + team2 + "  " + team1Array[i] + " -" + team2Array[i]);
		}
	}

	static void gameRecord(Scanner value, int i) {
		System.out.println("Match" + (i + 1));
		System.out.print("First Team gained point : ");
		team1Array[i] = value.nextInt();

		System.out.print("Second Team gained point : ");
		team2Array[i] = value.nextInt();

		if (team1Array[i] > team2Array[i]) {
			team1Wins++;

		} else {
			team2Wins++;
		}

	}

}
