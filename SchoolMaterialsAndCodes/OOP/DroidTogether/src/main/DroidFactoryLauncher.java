package main;

import model.Droid;
import model.DroidAssembler;
import model.TextEncoder;
import model.TextRepeater;

public class DroidFactoryLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TextEncoder encode = new TextEncoder("Mamiii");

//		TextRepeater repeat = new TextRepeater("maiii");
//		repeat.work();

		// Droid d= new Droid(encode,"encode");
		// d.doWork();
		//System.out.println(d.toString());
//		
//		TextEncoder droidencode= new TextEncoder("Hello world");
//		DroidAssembler ass= new DroidAssembler();
//		ass.assemble(droidencode);
//		
		
		TextEncoder testEncoder = new TextEncoder("Hello World");
		TextRepeater testRepeater = new TextRepeater("Hallo Gerke",7);

		DroidAssembler assembler = new DroidAssembler();
		Droid myDroid1 = assembler.assemble(testEncoder);
		Droid myDroid2 = assembler.assemble(testRepeater);
		myDroid1.doWork();
		myDroid2.doWork();
	}

}
