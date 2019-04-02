package recursie;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayMethodenTest {

	@Test
	public void indexOfBestaandeWaarde() {
		int[] haystack = {6,12,1,9,8,3};
		int needle = 3;
		int expected = 5;
		
		int result = ArrayMethoden.vind(haystack, needle);
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void indexOfWaardeBestaatNiet() {
		int[] haystack = {6,12,1,9,8,0};
		int needle = 3;
		int expected = -1;
		
		int result = ArrayMethoden.vind(haystack, needle);
		
		assertEquals(expected, result);
	}
	
	@Test
	public void indexOfBestaandeEersteWaarde() {
		int[] haystack = {6,12,1,3,8,3};
		int needle = 3;
		int expected = 3;
		
		int result = ArrayMethoden.vind(haystack, needle);
		
		assertEquals(expected, result);
	}
	@Test
	public void maxValueTest() {
		int [] array= {6,12,1,9,8,3};
		int expected=12;
		int actual= ArrayMethoden.maxValue(array);
		assertEquals(expected, actual);
	}

}
