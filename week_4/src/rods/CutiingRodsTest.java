package rods;

import static org.junit.Assert.*;

import org.junit.Test;

public class CutiingRodsTest {

	@Test
	public void testSpecialRods() {
		
		CutiingRods test = new CutiingRods();
		int[] input = new int[] {3,2};
		int[] expected = new int[] {1,0};
		int[] output =test.specialRods(2,input);
		assertArrayEquals(expected,output);
		
	}

}
