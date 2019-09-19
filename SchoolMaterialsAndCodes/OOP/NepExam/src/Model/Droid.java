package Model;

public abstract  class Droid {
	private int leven;
	private int id;
	private int STANDART_AANTAL_LEVENS=70;

	public Droid(int leven, int id) {
		super();
		this.leven = leven;
		this.id = id;
	}
	

	public int getLeven() {
		return leven;
	}


	public void setLeven(int leven) {
		this.leven = leven;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
	
		return String.format("Droid heeft: %s, levens: %d", id, leven);
	}

}
