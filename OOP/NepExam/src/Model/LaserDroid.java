package Model;

public class LaserDroid extends Droid implements AanvalsDroid {
	private String laser;

	public LaserDroid(int leven, int id,String laser) {
		super(leven, id);
		this.laser=laser;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aanval() {
		// TODO Auto-generated method stub
		
	}

}
