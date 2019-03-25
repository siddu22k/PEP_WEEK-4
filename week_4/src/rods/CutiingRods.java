/*A young mischievous boy Harsh, got into a trouble when his mechanical workshop teacher told him to cut Iron rods. The rod cutting algorithm is as follows:

Step 1. If the rod can be divided into two equal parts, cut it and choose any one of them.

Step 2. Else cut the rod into two parts having non-zero integral lengths such that the difference between the lengths of the two pieces is minimized, and then choose the piece having smaller length.

Step 3. Repeat the above algorithm with the currently chosen piece. If the length of the currently chosen piece becomes 1 , stop the algorithm.

There can be special rods which require Step 2 in every step of its cutting. Harsh want to find out the number of such special rods. Help Harsh to find out the answer.

*/

package rods;


public class CutiingRods {
	public int [] specialRods(int noOfCases,int [] input)
	{
	
		int[] output = new int[noOfCases];
		
        for ( int i=0;i<noOfCases;i++)
        {
            int test=input[i];
            int count=0;
            while(test!=1)
            {
                if(test%2!=0)
                {
                    count++;
                }
                test=test/2;              
                
            }
            
            output[i]=count;
            
        }
        
        return output;
        }
}
