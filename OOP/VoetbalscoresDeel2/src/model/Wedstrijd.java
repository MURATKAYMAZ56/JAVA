package model;

public class Wedstrijd {
	/*
	 * The Competition class must comply with the UML diagram above. a. Declare all
	 * variables and make them private. b. Create an all-args constructor Match
	 * (Team home Team, Team out Team, int for Goals, int against Objectives) that
	 * copies the teams and numbers that have been added to the associated
	 * attributes. Also make the two other constructors (see the diagram) and take
	 * care of constructor chaining. c. Create a get and a set method for all
	 * attributes. d. Create two methods get MatchPointsHomeTeam () and get
	 * MatchPointPointsTeam () that on the basis of the goals, whether 3, 1 or 0
	 * points were earned by the home team, or the out team. e. Create a method
	 * setTotalPointsHomeTeam () and setTotalPointsOutTeam () that for the homeTeam
	 * and the outTeam update the attribute totalPoints. These methods pick up the
	 * current value of totalPoints and add the matchPoints of the match on. They
	 * use the applicable method getWedstrijdPuntenThuisTeam or UitTeam, which in
	 * step 3b. are made. f. Create a setToonpointsTeams () method for both teams
	 * based on the results goals for and the goals against adjusts. Note: it is
	 * about 4 changes! g. Create a printStrush () method that determines the result
	 * based on the value of the attributes print: Result of the match Ajax-PEC: 5-0
	 * h. Create a method printWedstrijdPunten () that prints: This yields 3 match
	 * point for Ajax and 0 match point for PEC.
	 */

	private Team thuisTeam;
	private Team uitTeam;
	private int voorDoelPunt;
	private int tegenDoelPunt;
//
//	int totalThuisTeamPunt = 0;
//	int totalUitTeamPunt = 0;

	public Wedstrijd() {
		this(new Team(), new Team());

	}

	public Wedstrijd(Team thuisTeam, Team uitTeam) {
		this(thuisTeam, uitTeam, 0, 0);

	}

	public Wedstrijd(Team thuisTeam, Team uitTeam, int voorDoelPunt, int tegenDoelPunt) {
		this.thuisTeam = thuisTeam;
		this.uitTeam = uitTeam;
		this.voorDoelPunt = voorDoelPunt;
		this.tegenDoelPunt = tegenDoelPunt;

	}

	public Team getThuisTeam() {
		return thuisTeam;
	}

	public void setThuisTeam(Team thuisTeam) {
		this.thuisTeam = thuisTeam;
	}

	public Team getUitTeam() {
		return uitTeam;
	}

	public void setUitTeam(Team uitTeam) {
		this.uitTeam = uitTeam;
	}

	public int getVoorDoelPunt() {
		return voorDoelPunt;
	}

	public void setVoorDoelPunt(int voorDoelPunt) {
		this.voorDoelPunt = voorDoelPunt;
	}

	public int getTegenDoelPunt() {
		return tegenDoelPunt;
	}

	public void setTegenDoelPunt(int tegenDoelPunt) {
		this.tegenDoelPunt = tegenDoelPunt;
	}

	public int getWedstrijdPuntenThuisTeam() {
		int result = 0;
		if (voorDoelPunt > tegenDoelPunt) {
			result = 3;
		} else if (voorDoelPunt == tegenDoelPunt) {
			result = 1;
		}
		return result;
	}

	public int getWedstrijdPuntenUitTeam() {

		int result = 0;
		if (voorDoelPunt < tegenDoelPunt) {
			result = 3;
		} else if (voorDoelPunt == tegenDoelPunt) {
			result = 1;
		}
		return result;

	}

	public void setTotaalPuntenThuisTeam() {
		int totalpuntenThuisTeam = thuisTeam.getTeamPunten();
		totalpuntenThuisTeam = +getWedstrijdPuntenThuisTeam();
		thuisTeam.setTotalVoorDoelPunten(totalpuntenThuisTeam);

	}

	public void setTotaalPuntenUitTeam() {
		int totalPuntenUitTeam = uitTeam.getTeamPunten();

		totalPuntenUitTeam = +getWedstrijdPuntenUitTeam();
		uitTeam.setTeamPunten(totalPuntenUitTeam);
	}

	public void setDoelpuntenTeams() {
		int totalThuisVoorDoelPunten = thuisTeam.getTotalVoorDoelPunten();
		int totalThuisTegenDoelPunten = thuisTeam.getTotalTegenDoelPunten();
		int totalUitVoorDoelPunten = uitTeam.getTotalVoorDoelPunten();
		int totalUitTegenDoelPunten = uitTeam.getTotalTegenDoelPunten();

		totalThuisVoorDoelPunten = +voorDoelPunt;
		totalThuisTegenDoelPunten = +tegenDoelPunt;
		totalUitVoorDoelPunten = +tegenDoelPunt;
		totalUitTegenDoelPunten = +voorDoelPunt;

		thuisTeam.setTotalVoorDoelPunten(totalThuisVoorDoelPunten);
		thuisTeam.setTotalTegenDoelPunten(totalThuisTegenDoelPunten);
		uitTeam.setTotalVoorDoelPunten(totalUitTegenDoelPunten);
		uitTeam.setTotalTegenDoelPunten(totalUitVoorDoelPunten);

	}

	public void printUitslag() {
		System.out.println("Uitslag van de wedstrijd" + thuisTeam + " - " + uitTeam + ":"
				+ thuisTeam.getTotalVoorDoelPunten() + " - " + uitTeam.getTotalVoorDoelPunten());

	}

	public void printWedstrijdPunten() {
		System.out
				.println("Dit levert " + getWedstrijdPuntenThuisTeam() + "wedstrijdpunt voor" + thuisTeam.getTeamNaam()
						+ "en" + getWedstrijdPuntenUitTeam() + " wedstrijdpunt voor" + uitTeam.getTeamNaam());

	}

}
