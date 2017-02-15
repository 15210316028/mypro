package day1027;

import java.util.Scanner;

public class demo2
{

	public static void main(String[] zhu) 
	{		        
		Scanner I=new Scanner(System.in);
		int [] cj=new int []{99,85,82,63,60,0};				
		int wz=cj.length;//保存新增成绩的位置
		System.out.println("请输入新增成绩：");
		int s=I.nextInt();//输入要插入的数据
		//找到新元素插入的位置
		for (int i = 0; i < cj.length; i++) 
		{			             
			if (s>cj[i]) 
			{
			   wz=i+1;
			   break;
			 }
		}
		//元素后移
		for (int i =cj.length-1 ; i >wz ; i--) 
		{
			cj[i]=cj[i-1];//下标开始的元素后移一个位置
		}
			cj[wz-1]=s;
			System.out.println("插入成绩的下标："+wz);			     
			System.out.println("插入后成绩信息是：");
		for (int i = 0; i < cj.length; i++)
		{
			 System.out.println(cj[i]+"\t");
		}
	}
}

