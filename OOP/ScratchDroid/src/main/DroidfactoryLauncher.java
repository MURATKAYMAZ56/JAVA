package main;

import model.Droid;
import model.TextEncoder;
import model.TextRepeater;

public class DroidfactoryLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dit is tentamen OOP1van <Murat Kaymaz><500816865>");

		TextEncoder test1 = new TextEncoder("Hello World");
		//test1.work();
		TextRepeater repeaterTest = new TextRepeater("Repeated test");
		//repeaterTest.work();
		
		Droid testDroid=new Droid("Text Encoder droid",repeaterTest);
		testDroid.doWork();
	}

}
