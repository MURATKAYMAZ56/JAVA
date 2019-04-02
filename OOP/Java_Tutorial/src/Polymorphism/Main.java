package Polymorphism;
/// plymorfiz kdoun devamliliigi icin onemli ornegimn allttaki kode yeni klass aklemek istediginde 
//hic bir kodu degistirmeden sadece yeni klass olusturuyorsun ve blala balaa blaa

class Animal {
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("hayvan konusuyor...");
	}

}

class Bird extends Animal {

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.println(getName() + " otuyor...");////// getName yapti dikkat
	}

}

class Dog extends Animal {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.println(getName() + " havliyor...");////// getName yapti dikkat
	}

}

class Horse extends Animal {

	public Horse(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.println(getName() + " kisniyor...");////// getName yapti dikkat
	}

}

public class Main {
	
	//// bu method plymorfizmi anlatiyor burada 
public static void speaktry(Animal animal) {
	animal.speak();
}
	public static void main(String[] args) {
		///// yukarda naptik?
		// once 3 tane alt class olusturduk Bird,Dog,Horse seklinde hepside Animal i
		///// extend yapiyr
		// simdi bunlari polimorfizm le kullanacagiz.
		Animal animal = new Animal("hayvan");
		Bird bird = new Bird("limon");
		Dog dog = new Dog("karabas");
		Horse horse = new Horse("sahbatur");
//		animal.speak();
//		bird.speak();
//		horse.speak();
//		dog.speak();
		// normalyazilis bu fakat tafsiye edilmiyor ve yapilmiyor o yuzden pmorfizm
		// kullaniliyor

		Animal animal2 = new Bird("Mavis");
		animal2.speak();
		
		speaktry(new Bird("cimcime"));
		speaktry(new Dog("karakacasn"));

	}

}
