package day1029;

public class demo4
{
	public static void main(String[] zhu) 
	{
		int[] s=new int[10];
		int max=0,xb=0;//数组最大值、下标		
		System.out.print("变换前数组：");
		for(int i=0;i<s.length;i++)
		{
			
			s[i]=(int) (Math.random()*10);
			System.out.print(s[i]+",");									
			if(max<s[i])
			{			
				max=s[i];
				xb=i;
			}
		}
				s[xb]=s[0];
				s[0]=max;				
			System.out.print("\n变换后数组：");
			for(int i=0;i<s.length;i++)
			{
			System.out.print(s[i]+",");
			}
	}						
}		
		


