package model;

/*
 The Team class must comply with the diagram.
a. Declare the four attributes, give them the correct data type and make them private.
b. Create an all-args constructor for a Team.
c. Create a Team constructor (String teamName), where you can give a teamName,
but the other attributes give the default value of 0. Provide constructor chaining and
so call the all-args constructor correctly in this constructor.
d. Create a default constructor that puts the teamName on the empty string ("") and the other one
attributes to 0. Again use constructor chaining.
e. Create a get and a set method for all attributes.
f. Create a getDoelSaldo () method that is based on total for Goals and
TotalNo goals determines the correct goal balance of the team.
g. Create a printStatusTeam () method that shows a sentence for a team as: "The NAC team
has 7 game point and a goal difference of 13 ". This method uses the
method getDoelSaldo ().
*/
public class Team {
	private String teamNaam;
	private int teamPunten;
	private int totalVoorDoelPunten;
	private int totalTegenDoelPunten;

	public Team() {
		this("");
	}

	public Team(String teamNaam) {
		this(teamNaam, 0, 0, 0);
	}

	public Team(String teamNaam, int teamPunten, int totalVoorDoelPunten, int totalTegenDoelPunten) {
		this.teamNaam = teamNaam;
		this.teamPunten = teamPunten;
		this.totalVoorDoelPunten = totalVoorDoelPunten;
		this.totalTegenDoelPunten = this.totalTegenDoelPunten;

	}

	public String getTeamNaam() {
		return teamNaam;
	}

	public void setTeamNaam(String teamNaam) {
		this.teamNaam = teamNaam;
	}

	public int getTeamPunten() {
		return teamPunten;
	}

	public void setTeamPunten(int teamPunten) {
		this.teamPunten = teamPunten;
	}

	public int getTotalVoorDoelPunten() {
		return totalVoorDoelPunten;
	}

	public void setTotalVoorDoelPunten(int totalVoorDoelPunten) {
		this.totalVoorDoelPunten = totalVoorDoelPunten;
	}

	public int getTotalTegenDoelPunten() {
		return totalTegenDoelPunten;
	}

	public void setTotalTegenDoelPunten(int totalTegenDoelPunten) {
		this.totalTegenDoelPunten = totalTegenDoelPunten;
	}

	public int getDoelSaldo(int totalVoorDoelPunten, int totalTegenDoelPunten) {

		return (int) (totalVoorDoelPunten - totalTegenDoelPunten);
	}

	public void printStatusTeam() {
		System.out.println("Het team "+teamNaam+" heeft "+ teamPunten +" wedstrijdpunt en een doelsaldo van "
				+ getDoelSaldo(totalVoorDoelPunten, totalTegenDoelPunten));

	}

}
