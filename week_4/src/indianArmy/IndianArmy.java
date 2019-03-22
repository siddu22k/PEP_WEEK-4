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
			int j=0,tp=0;
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
