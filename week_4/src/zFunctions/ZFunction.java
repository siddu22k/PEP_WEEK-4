package zFunctions;
import java.util.*;

public class ZFunction {
	
	String alpha = "abcdefghijklmnopqrstuvwxyz";
	ArrayList<Integer> maxis = new ArrayList<Integer>();
	
	public int maxZed(String s)
	{
		int n = s.length();
	    int z[] = new int[n];
	    int R = 0;
	    int L = 0;
	        
	    for(int i = 1; i < n; i++) 
	    {
	        z[i] = 0;
	        if (R > i) 
	        {
	            z[i] = Math.min(R - i, z[i - L]);
	        }
	        while (i + z[i] < n && s.charAt(i+z[i]) == s.charAt(z[i])) 
	        {
	            z[i]++;
	        }
	        if (i + z[i] > R)
	        {
	            L = i;
	            R = i + z[i];
	        }
	    }

	    z[0] = 0;
	    Arrays.sort(z);
	    
	    return z[n-1];
	 }
	
	public ArrayList<Integer> genAllKLength(char[] set, int k) 
	{ 
	    int n = set.length;  
	    genAllKLengthRec(set, "", n, k); 
	    return maxis;
	} 
	
	public void genAllKLengthRec(char[] set,String prefix,int n, int k) 
	{ 
	       
	    if (k == 0)  
	    { 
	        maxis.add(maxZed(prefix));
	        return ; 
	    } 
	    
	  	    for (int i = 0; i < n; ++i) 
	    {  
	        String newPrefix = prefix + set[i];	         
	        genAllKLengthRec(set, newPrefix,n,k - 1);  
	    } 
	}
	
	public int finalCall(int[] input) {
		String set = alpha.substring(0,input[1]);
		char[] st = set.toCharArray();
		int k= input[0];
		ArrayList<Integer> al = genAllKLength(st,k);
		
		int sum = 0;

		for(int i: al) 
		{
		    sum += i;
		}
		
		return sum%input[2];		
		
	}
}
