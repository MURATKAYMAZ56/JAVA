package model;

public class Droid {
	private int droidCounter=0;
	private int serialNumber;
	private String designation;
	private Workable module;
	public Droid(String designation, Workable module) {
		super();
		this.designation = designation;
		this.module = module;
		serialNumber=++droidCounter;
	};
	public void doWork() {
		module.work();
		
		
	}
	public void updateModule(Workable module,String designation) {
		this.designation = designation;
		this.module = module;
		

	}
	@Override
	public String toString() {
		return "designation=" + designation +",serial: " + serialNumber ;
	}
	
	

}
