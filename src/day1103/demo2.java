package day1103;

import java.util.Scanner;

public class demo2 
{
	public static void main(String[] args) 
	{
		Scanner I=new Scanner(System.in);		
		System.out.println("*****��ӭ��¼ϵͳ*****");
		boolean find;
		do
		{
			zhuCe2 A=new zhuCe2();
			System.out.print("�������֤��(16��18λ)��");
			String zh=I.next();
			System.out.print("�����ֻ��ţ�11λ����");
			String sjh=I.next();
			System.out.print("���������ţ�����4λ������7λ����");
			String zjh=I.next();					
			find=A.length(zh, sjh, zjh);
		}
		while(!find);									
	}	
}
