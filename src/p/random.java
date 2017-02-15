package p;

import java.util.*;

public class random {
	
	public static void main(String[] args)
	{		
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<10;)
		{
			int num=(int) (Math.random()*20+1);
			if(!l.contains(num))
			{
			l.add(num);
			i++;
			}							
		}
		for(int i:l)
		{
			System.out.print(i+" ");
		}
	}
}
