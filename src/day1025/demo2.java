package day1025;

public class demo2 {

	public static void main(String[] zhu)
	{
		int i=1;
		int j=0;
		int J=0;
		while(2*i<=100)
		{	
			int num=2*i+j;
			int NUM=2*i-1+J;
			j=num;
			J=NUM;
			i++;
		}
		System.out.println("偶数之和是："+j+"\t奇数之和四："+J);
//		for(int i=1,j=0,J=0;2*i<=100;j=2*i+j,J=2*i-1+J,i++)			
//		System.out.println("偶数之和是："+j+"\t奇数之和是："+J);
		
	
		
		
	}			
}
