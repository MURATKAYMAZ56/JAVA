package AbstractClass;

public abstract class AbstractDatabase {
	
	public void Add() {
		System.out.println("eklendi...");
	}
	public void Substract() {
		System.out.println("Cikartildi");
	}
	abstract void Update();
	abstract void Delete();

}
