package day1029;

public class demo1 
{
	public static void main(String[] zhu) 
	{
		int i=9;
		for(int x=0;x<i;x++)
		{
			for(int y=0;y<=x;y++)
			{
				if(((x<i-1)&&(y==0||y==x))||((x==i-1)&&y>=0))
				{
				System.out.print("*");
				}				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
