package RevisingTopics;

import java.util.Scanner;

public class BestOFSEVENREVise {
	static Scanner input;
	static String Team1, Team2;
	static int[] team1Records = new int[7];
	static int[] team2Records = new int[7];
	static int team1Wins = 0;
	static int team2Wins = 0;
	static String winnerTeam;

	public static void main(String[] args) {
		System.out.println("Dirt programa is gemaakt door Murat Kaymaz Class-14");
		System.out.print("Name van Team1: ");

		input = new Scanner(System.in);
		Team1 = input.nextLine();
		System.out.print("Name van team 2: ");
		Team2 = input.nextLine();
		for (int i = 0; i < 7; i++) {
			gameRecords(input, i);
			if (team1Wins == 4 || team2Wins == 4) {
				if (team1Wins > team2Wins) {
//					winnerTeam=Team1;
//					
//				}else {
//					
//					winnerTeam=Team2;
//				}
					break;
				}

			}
		}
		gameRecordsPrint();

	}

	static void gameRecordsPrint() {
		System.out.println("Total played games : " + (team1Wins + team2Wins));
		if (team1Wins > team2Wins) {
			System.out.println(Team1 + " heeft wonnen met  " + team1Wins + " - " + team2Wins);

		}else {
			System.out.println(Team2 + " heeft wonnen met  " + team2Wins + " - " + team1Wins);
		}
		for(int i=0;i<(team1Wins+team2Wins);i++) {
			System.out.println("wesstrijd "+(i+1)+" : "+Team1+" - "+Team2+"    "+team1Records[i]+" - "+team2Records[i]);
		}
		
	}

	static void gameRecords(Scanner value, int i) {

		System.out.println("Uitslag wedstrijd " + (i + 1));
		System.out.print("Aantal punten " + Team1+" :");
		team1Records[i] = value.nextInt();

		System.out.print("Aantal punten " + Team2+" :");
		team2Records[i] = value.nextInt();
		if (team1Records[i] > team2Records[i]) {
			team1Wins++;
		} else {
			team2Wins++;
		}

	}

}
