/*
 * Protection of the Indian border and safe transport of items from one point to another along the border are the paramount jobs for the Indian army. However they need some information about the protection status along the length of the border. The border can be viewed as the real x-axis. Along the axis, Indian army has N checkpoints for lookout. 

We know that each checkpoint is located at an integer location xi. Each checkpoint must have a fleet of armed men which are responsible for guarding the neighboring areas of the checkpoint and provide military assistance of all kinds. The size of the fleet is based on the location of the checkpoint and how active the region is for terrorist activities. 

Given the number of armed men assigned at the ith checkpoint, as pi, this information is available for all checkpoints. 
With the skills of the armed men, it is known that if for the ith checkpoint, the length on the x axis that they can defend is a closed interval [xi-pi, xi+pi].

Now, your task is to transport some military items from position S to the end position E on the x-axis. 
 */


package indianArmy;

public class IndianArmy {
	
	public int noService(int[] start_end,int[][] assignment )
	{	
		int count=1;
		int[] start = new int[start_end[0]];
		int[] end = new int[start_end[0]];
		
		for (int i=0;i<start_end[0];i++)
		{
			
			start[i]=assignment[i][0]-assignment[i][1];
			end[i]=assignment[i][1]+assignment[i][0];			
			
		}
		
		for (int i = 0; i < start_end[0]; i++)
		{
            for (int j = 0; j < start_end[0]-i-1; j++)
            {
                if (start[j] > start[j+1])
                {
                    int temp = start[j];
                    start[j] = start[j+1];
                    start[j+1] = temp;
                    
                    
                    temp = end[j];
                    end[j] = end[j+1];
                    end[j+1] = temp;                        
                }
            }
		}
		
		
		for ( int i=start_end[1];i<=start_end[2];i++)
		{
			int j=0;
			int tp=0;
			while(j<start_end[0])
			{
				if( i>=start[j] && i<=end[j])
				{	
					
					break;
				}
				
				else
					tp++;
				j++;
			}
			
			if(tp==start_end[0])
				count++;
		}
		
		return count;
		
	}

}
