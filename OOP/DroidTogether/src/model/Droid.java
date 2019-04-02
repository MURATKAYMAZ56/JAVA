package model;

public class Droid {
	private static int droidCounter = 0;
	private int serialNumber;
	private String designation;
	private Workable module;

	public Droid(Workable module, String designation) {

		this.designation = designation;
		this.module = module;
		this.serialNumber = ++droidCounter;
	}

	public void doWork() {
		// TODO Auto-generated method stub
		module.work();

	}

	public void updateModule(Workable module, String designation) {
		// TODO Auto-generated method stub
		this.designation = designation;
		this.module = module;
	}

	@Override
	public String toString() {
		return "Designation  :" + designation + ",serial: " + serialNumber;
	}

}
