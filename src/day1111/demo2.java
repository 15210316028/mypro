package day1111;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class demo2 
{
	public static void main(String[] args) 
	{
		Scanner I=new Scanner(System.in);
		Logger logger=Logger.getLogger(demo2.class);		
		try{
			System.out.print("���뱻������");
			int num=I.nextInt();
			System.out.print("���������");
			int NUM=I.nextInt();
			int y=NUM/num;
			System.out.println(y);
		}
		catch(Exception e)
		{
			logger.debug("��������");			
		}
		System.out.print("ллʹ��");
	}
}
