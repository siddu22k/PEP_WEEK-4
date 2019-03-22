package glowingBulbs;

import java.util.ArrayList;
import java.util.*;



public class GlowingBulb {
	
	public int[] kthBulb(int noOfCases,String[] input,int[] position)
	{
		ArrayList<Integer> multiples = new ArrayList<>();
		int[] output = new int[noOfCases];
		
		for ( int i=0;i<noOfCases;i++)
		{
			for ( int j=0;j<40;j++)
			{
				if(input[i].charAt(j)=='1')
				{
					multiples.add(j+1);
					
				}
			}	
		
			ArrayList<Integer> al = new ArrayList<>();
			
			int count=0;
			
			while(count<position[i])
			{				
				for ( int j=0;j<multiples.size();j++)
				{
					int t=1;
						while(t>0)
						{
								int z1=t*multiples.get(j);
								t++;
								if(z1>multiples.get(0)*position[i]) {
									break;
								}				
					
								if (!al.contains(z1)) 
								{
									al.add(z1);
									count++;
								}
						}
				}				
			}
			Collections.sort(al);
			output[i]=(int) al.get(position[i]-1);
			al.clear();
			multiples.clear();		
		}
		
		return output;		
	}
}
