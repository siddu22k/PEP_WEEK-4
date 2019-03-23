package specialWeight;

public class NonIncreasing {
	
	public int[] settingOrder(int[] n_k,int[] arr)
	{
		int[] weights = new int[n_k[0]];
		
		for ( int i=0;i<n_k[0];i++)
		{
			weights[i]=arr[i]%n_k[1];
		}
		
		
		
		
		for (int i = 0; i < n_k[0]; i++)
		{
            for (int j = 0; j < n_k[0]-i-1; j++)
            {
                if (weights[j] < weights[j+1])
                {
                    int temp = weights[j];
                    weights[j] = weights[j+1];
                    weights[j+1] = temp;
                    
                    
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;                        
                }
            }
		}
		
		return arr;
	}

}
