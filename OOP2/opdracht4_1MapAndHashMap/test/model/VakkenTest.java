package model;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import main.VakkerLauncher;

public class VakkenTest {
	private Vakken_Box vakTest;
/*
	• Write unit tests that verify that:
		o the subject CS101 has 6 ects in it
		o the course CS999 is not in it
		o there is a course with an ects value of 10
		
		*
		*/
	@Test
	public void testCS101() {
		
		vakTest= new Vakken_Box();
		
		boolean expected=true;
        boolean actual=vakTest.hm.containsValue(6);
		assertEquals(expected, actual);
	      

	     
	}
	
	@Test
	public void testValueNotIn() {
		
		vakTest= new Vakken_Box();
		
		boolean expected=false;
        boolean actual=vakTest.hm.containsKey("CS999");
		assertEquals(expected, actual);
	      

	     
	}
	

}
