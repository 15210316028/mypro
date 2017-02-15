package day1102;

import java.util.Arrays;

public class paiXu 
{
	String[] sz;
	int i=0;
	public void a(int size)
	{
		sz=new String[size];
	}
	public void b(String name)
	{
		sz[i]=name;
		i++;
	}
	public void c()
	{
		for(int j=0;j<sz.length;j++)
		{
			System.out.print(sz[j]+" ");
		}
	}
	public String[] d(String name)
	{
		for(int j=0;j<sz.length;j++)
		{
			Arrays.sort(sz);
			System.out.print(sz[j]+" ");
			
		}
		return sz;
	}
}
