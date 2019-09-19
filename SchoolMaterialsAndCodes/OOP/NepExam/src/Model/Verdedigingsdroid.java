package Model;

public class Verdedigingsdroid extends Droid implements AanvalsDroid{
	private String piloot;
	private int plusLeven=50;
	

	public Verdedigingsdroid(int leven, int id,String piloot) {
		super(leven, id);
		this.piloot=piloot;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aanval() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return String.format("Droid  %d heeft %d levens en wordt bemand door %s", getId(),getLeven(),this.piloot);
	}
	public void herstel() {
		int leven=getLeven()+plusLeven;
		setLeven(leven);
		
	}
	
	

}
