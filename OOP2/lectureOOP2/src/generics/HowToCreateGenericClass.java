package generics;

public class HowToCreateGenericClass<T> {
	private T t;

	public void add(T t) {
		this.t = t;

	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		HowToCreateGenericClass<Integer> Integer = new HowToCreateGenericClass<Integer>();
		HowToCreateGenericClass<String> StringClass = new HowToCreateGenericClass<String>();
		Integer.add(10);
		StringClass.add("Hey I created generic class ");
		System.out.printf("integer value f Integr class is : %d \n string value of StringClass is: %s", Integer.get(),
				StringClass.get());

	}

}
