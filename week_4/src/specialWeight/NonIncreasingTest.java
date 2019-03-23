package specialWeight;

import static org.junit.Assert.*;

import org.junit.Test;

public class NonIncreasingTest {

	@Test
	public void testSettingOrder() {
		NonIncreasing test = new NonIncreasing();
		int[] n_k = new int[] {5,2};
		int[] arr = new int[] {1,2,3,4,5};
		
		int[] result = new int[] {1,3,5,2,4};
		
		int[] output = test.settingOrder(n_k, arr);
		
		assertArrayEquals(output,result);
		
		
		
	}

}
