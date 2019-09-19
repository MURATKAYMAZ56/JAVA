package INheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employe1 = new Employee("Murat", "Bilisim", 3000);
		employe1.showInfos();

		Manager manager1 = new Manager("Murat Baskan", "Bilisim ", 5000,10);
		manager1.showInfos();
		// normalde showinfos methodu employee classinda tanimlanmis fakat biz
		// bu klasi extend ettigimiz icin kalitim(inheritance olarak ) alt grubu yani
		// manager klasina aktarmistir
		manager1.raiseSalaris(100);
		
		System.out.println("toString yardimiyla manager objesi yazildi "+manager1);
		

	}

}
