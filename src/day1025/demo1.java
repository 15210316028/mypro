package day1025;

public class demo1 {

	public static void main(String[] zhu)
	{					
//		for (double i=25,j=1;i<100;i=i*1.25,j++)
//		{
//			System.out.println("第"+(int)j+"年"+(int)i+"人");						
//		}
//		
		double i=25;
		int j=1;
		while(i<=100)
		{
			System.out.println("第"+j+"年"+(int)i+"人");
			i=i*1.25;
			j++;
		}
			System.out.println("第"+j+"年"+(int)i+"人");
		
	}
	

}
