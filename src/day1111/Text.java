package day1111;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Text 
{

	public static void main(String[] zhu) throws Exception
	{
		Logger logger=Logger.getLogger(Text.class);//������־��
		Scanner I=new Scanner(System.in);
		Age a=new Age();
		System.out.print("�������䣺");
		int age=I.nextInt();
		try
		{
			a.setAge(age);
			a.show();
		}
		catch(Exception ex)
		{
			System.err.println(ex.getMessage());
		}
	}

}
