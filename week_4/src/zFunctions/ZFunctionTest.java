package zFunctions;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZFunctionTest {

	@Test
	public void testMaxZed() {
		ZFunction test = new ZFunction();
		int[] input = new int[] {3,2,1000};
		int output = test.finalCall(input);
		int expected=8;
		assertEquals(output,expected);
		
		
		
	}

}
