package day1027;

import java.util.Arrays;
import java.util.Scanner;

public class demo1
{

	public static void main(String[] zhu)
	{
		Scanner I=new Scanner(System.in);
		int s ;
		int[] cj=new int[]{99,85,82,63,60}; 
		Arrays.sort(cj);
		for(int i=0;i<cj.length;i++)
		{
			System.out.println("ÊäÈëÐÂ³É¼¨£º");
			 s=I.nextInt();
			System.out.println(cj[i]);		
		}
	}
}

