/*
 * You have been given an array A of size N and an integer K. This array consists of N integers ranging from 1 to . Each element in this array is said to have a Special Weight. The special weight of an element  is .

You now need to sort this array in Non-Increasing order of the weight of each element, i.e the element with the highest weight should appear first, then the element with the second highest weight and so on. In case two elements have the same weight, the one with the lower value should appear in the output first.
 */


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
