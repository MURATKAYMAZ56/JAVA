package mainvoetbalscores;

import model.Team;

public class VoetbalScoresLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Test the operation of the class Team by entering an object of type Team in
		 * the main method using the all-args constructor (eg Team (Twente, 15, 28, 13))
		 * and then with the printStatusTeam () method shows that the correct
		 * information is coming back.
		 */

		/*
		 * Now build the final application (basic) a. Create an array of 'teams' for 3
		 * Teams. b. Consider 3 team names and make an object of it for all 3 elements
		 * of the array type Team with always one of the 3 team names. c. Create an
		 * array of 'contests' for 6 Competitions. d. For all 6 elements of the
		 * 'matches' array, create an object of the Match type between the 3 teams in
		 * the 'teams' array. Note that you have all 6 possible matches creates. You do
		 * not give the goals yet! e. Now ask in a for-loop for all 6 matches the goals
		 * and goals of the user and ensure that these are assigned to the correct
		 * attributes of the relevant match granted. f. Show the user the results of all
		 * matches. g. Let the results be calculated for all matches, that is to say for
		 * the teams the total number of match points, the total number of goals and
		 * goals must be updated. h. Show the user of all teams the total number of
		 * match points and the goal balance calculating all matches.
		 */

		Team Twente = new Team();
		// Twente, 15, 28, 13
		Twente.setTeamNaam("Twente");
		Twente.setTeamPunten(15);
		Twente.setTotalVoorDoelPunten(28);
		Twente.setTotalTegenDoelPunten(13);
		Twente.printStatusTeam();
		// a. Create an array of 'teams' for 3 Teams.
		Team[] teamArray = { new Team("AJAX"), new Team("PSV"), new Team("FEYENOORD") };
		// b. Consider 3 team names and make an object of it for all 3 elements of the
		// array
		// type Team with always one of the 3 team names.

		// System.out.println(teamArray[0].getTeamNaam());

		String[] wedstrijden = new String[6];

	}

}
