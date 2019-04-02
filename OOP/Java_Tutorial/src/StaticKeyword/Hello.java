package StaticKeyword;

//we declare 2 method here one is static and the one is not
///the issue is if you call these method in MyClass static one cannot be called by instance;
public class Hello {
	public static String doSomethingStatic(String message) {
		System.out.println(message);
		return message;
	}

	public String doSomethingWithoutStaticMethod(String message) {
		System.out.println(message);
		return message;
	}

}
