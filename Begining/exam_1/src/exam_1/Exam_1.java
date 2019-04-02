package exam_1;

import java.util.Scanner;

public class Exam_1 {

	public static void main(String[] args) {
		System.out.println("Dit programma is gemaakt door Murat Kaymaz,Chort14,");
		System.out.print("naam van team1 :");
		Scanner invoer=new Scanner(System.in);
		String team1=invoer.next();
		System.out.print("naam van team2 :");
		String team2=invoer.next();
		//askingResultOfEachGame(team1,team2);
		int team1Winner=0;
		int team2winner=0;
		for(int i=1;i<8;i++) {
			System.out.println("Aantal puenten "+team1);
			int win1=invoer.nextInt();
			System.out.println("Aantal puenten"+team2);
			int win2=invoer.nextInt();
			//checkResult(point1,point2);
			//System.out.println(win1);
			//System.out.println(win2);
			if(win1>win2) {
				team1Winner++;
				//System.out.println("team1"+team1Winner);
				checkResult(team1Winner,team2winner);
			} else {
				team2winner++;
				//System.out.println(team2winner);
				checkResult(team1Winner,team2winner);
				
				
			}
			
			
		}

	}
	static int checkResult(int arg1 ,int arg2) {
		if(arg1==4) {
			
		}
		return 0;
		
	}


}
