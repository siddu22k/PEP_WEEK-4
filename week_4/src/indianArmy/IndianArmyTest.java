package indianArmy;

import static org.junit.Assert.*;

import org.junit.Test;

public class IndianArmyTest {

	@Test
	public void testNoService() {
		IndianArmy test = new IndianArmy();
		int[] start_end = new int[] {5,229,8419};
		int[][] assignment = new int[][] {{1795 ,95},{4873,720},{3149,81},{6101,2325},{3674,629}};
		
		int output = test.noService(start_end, assignment);
		
		assertEquals(output,2626);
		
	}

}
