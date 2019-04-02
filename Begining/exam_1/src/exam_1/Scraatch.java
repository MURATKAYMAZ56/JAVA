package exam_1;

import java.util.Scanner;

public class Scraatch {

	public static void main(String[] args) {
		System.out.println("Dit programma is gemaakt door Murat Kaymaz,Chort14,");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////");
		System.out.print("Naam van team 1 :");
		Scanner invoer=new Scanner(System.in);
		String team1=invoer.nextLine();
		System.out.print("Naam van team 2 :");
		String team2=invoer.nextLine();
		System.out.println("*************************************");
		int [] team1Array=new int[7];
		int [] team2Array=new  int[7];
		int team1Win=0;
		int team2Win=0;
	
		for(int i=0;i<7;i++) {
			System.out.println("Uitslag wedstrijd :"+(i+1));
			System.out.print("Aantal puenten  "+team1+" :");
			team1Array[i]=invoer.nextInt();
			
			System.out.print("Aantal puenten   "+team2+" :");
			team2Array[i]=invoer.nextInt();
			System.out.println("_____________________________________________________________");
			if(team1Win==4||team2Win==4) {
				printWinner(team1,team2,team1Win,team2Win,team1Array,team2Array);
				break;
				
			}
			if(team1Array[i]>team1Array[i]) {
				team1Win++;
				
			}else {
				team2Win++;
			}
			
		}
		
	}
	static void printWinner(String team1,String team2,int team1Winner,int team2Winner,int[]array1,int[]array2) {
		System.out.println("Aantal gespelde wedstrijd: "+team1Winner+team2Winner);
		if(team1Winner==4) {
			System.out.println(team1+" heeft gewonnen met "+team2+team1Winner+"-"+team2Winner);
			for(int i=0;i<team1Winner+team2Winner+1;i++) {
				System.out.println("wedstrijd  "+(i+1)+":"+team1+"--"+team2+array1[i]+"-"+array2[i]);
			}
			
			
		}else {
			System.out.println(team2+" heeft gewonnen met "+team1+team2Winner+"-"+team1Winner);
			for(int i=0;i<team1Winner+team2Winner+1;i++) {
				System.out.println("wedstrijd "+(i+1)+":"+team1+"--"+team2+array1[i]+"-"+array2[i]);
			}
		}
		
		
		
		
		
	}
	
	
	


}
