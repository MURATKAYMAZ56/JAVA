package INheritance;

public class Manager extends Employee {
private int number_of_employee;
	public Manager(String name, String department, int salary,int number_of_employee) {
		super(name, department, salary);
		this.number_of_employee=number_of_employee;
		
	}
	public void raiseSalaris(int amount) {
		System.out.println("Calisanlara "+amount+" tl zaam yapildi...");
	}
	@Override
	public void showInfos() {
		// TODO Auto-generated method stub
		super.showInfos();
		System.out.println("sorumlu oldugu calisan sayisi : " + this.number_of_employee);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Manager objesi";
	}
	

}
