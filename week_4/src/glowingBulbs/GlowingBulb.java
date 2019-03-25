/*There is an infinite series of bulbs indexed from 1. And there are 40 switches indexed from 1 to 40. Switch with index x is connected to the bulbs with indexes that are multiple of x. i.e switch 2 is connected to bulb 4, 6, 8 ....

You can easily observe that some bulbs are connected to multiple switches and some are not connected to any switch.

Chotu is playing with these switches, he wants to know the Kth glowing bulb from the start if certain switches are in ON state. If any of the switch is ON, connected to any bulb then bulb starts glowing. But chotu has special fond of prime numbers so he only puts prime indexed switches ON. */




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
