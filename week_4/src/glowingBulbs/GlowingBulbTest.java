package glowingBulbs;

import static org.junit.Assert.*;

import org.junit.Test;

public class GlowingBulbTest {

	@Test
	public void testKthBulb() {
		
		GlowingBulb test = new GlowingBulb();
		
		int noOfCases =3;
		String[] input = new String[] {"0110000000000000000000000000000000000000","0010000000000000000000000000000000000000","0100000000100000001000100000101000001000"};
		int[] position = new int[] {5,5,16807};
		
		int[] answer = new int[] {8,15,26866};
		
		int output[] = test.kthBulb(noOfCases, input, position);
		
		assertArrayEquals(answer,output);
		
		
		
	}

}
