package day1103;

import java.util.Scanner;

public class demo4 
{

	public static void main(String[] args)
	{
		Scanner I=new Scanner(System.in);
		int sum = 0;//定义要找的字的个数
		System.out.println("输入字符串：");//输入一句话
		String juzi=I.next();
		System.out.println("输入要查的字母：");//输入要找的字
		String zimu=I.next();
		StringBuffer zifu=new StringBuffer(juzi);
		String[] s=new String[juzi.length()];//将句子中每个字符当作元素构成数组		
		for(int i=0;i<juzi.length()-1;i++)//将句子每个字符隔开组成数组（字符间有“，”）
		{			
			zifu.insert(i,",");
		}
		String a=zifu.toString();
		s=a.split(",");//将字符间的“，”去掉，以便计算各数
		for(int i=0;i<s.length;i++)//查找所要计算的字母个数
		{
			if(s[i].equals(zimu))
				sum++;
		}
		System.out.println(juzi+"中有"+sum+"个"+zimu);
	}

}
