package INheritance;

public class Employee {

	private String name;
	private String department;
	private int salary;

	public Employee(String name, String department, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	//// en altta showInfos()da olan this.name this.department ve this.salary e biz manager
	//// klassta erisemeyiz o yuzden getetr and setter timladik ki cagirabilelim
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void showInfos() {
		System.out.println("Bilgier yukleniyor...");
		System.out.println("name: " + this.name);
		System.out.println("department: " + this.department);
		System.out.println("salary: " + this.salary);

	}

}
