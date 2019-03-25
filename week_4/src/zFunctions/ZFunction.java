/*
 * Data science is very popular now. A lot of universities have courses about it. A lot of companies have open data science positions. So it's quite important to know how to work with statistics. And this task can help you to make first step into statistics.

Lets define S as all strings of the length n consisting of letters from the some alphabet of the size a. For each string s lets define  - maximum among all z-function values of the string s. Your task is calculate  modulo . 

You can read more about z-function on https://e-maxx-eng.appspot.com/string/z-function.html. Also in this problem we define .
 */



package zFunctions;
import java.util.*;

public class ZFunction {
	
	String alpha = "abcdefghijklmnopqrstuvwxyz";
	ArrayList<Integer> maxis = new ArrayList<>();
	
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
