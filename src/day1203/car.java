package day1203;

import java.util.Scanner;

public class car 
{
	
	public void show(String name)
	{
		for(int i=0;i<6;i++)
		{				
			char random1=(char) (Math.random()*26+65);				
			char word = 0;
			int sum = 0;
			System.out.print((i+1)+name+random1+".");
			for(int j=0;j<5;)
			{
				int random2=(int) (Math.random()*36);
				if(random2<10)
				{
					word = (char) (random2+48);
					j++;
				}
				else
				{
					word = (char)(random2+55);
					sum++;
					if(sum>2||word=='O'||word=='I')
					{
						continue;
					}
					j++;
				}
				System.out.print(word);
			}
			System.out.println("");	
			
		}
	}
	
	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);
		car c=new car();
		System.out.print("输入省份简称：");
		String name=I.next();
		c.show(name);
		System.out.println("选择车牌号：");			
		System.out.println(I.nextInt()+"号，选择成功!");
	}

}
