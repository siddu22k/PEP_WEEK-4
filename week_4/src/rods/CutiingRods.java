package rods;

public class CutiingRods {
	public int [] specialRods(int noOfCases,int [] input)
	{
	
		int output[] = new int[noOfCases];
		
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
