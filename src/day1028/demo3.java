package day1028;

import java.util.Scanner;

public class demo3 
{

	public static void main(String[] zhu)
	{
		Scanner I=new Scanner(System.in);		
		for(int i=0;i<3;i++)
		{			
			System.out.println("输入第"+(i+1)+"家店三件产品价格:");
			int s=0;
			for(int j=0;j<3;j++)
			{
				double money=I.nextDouble();
				if(money<300)
			{				
				continue;
			}						
					s++;							
			}
			System.out.println("打折产品有"+s+"件！");
		}		
	}

}
