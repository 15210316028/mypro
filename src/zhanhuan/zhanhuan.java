package zhanhuan;

import java.util.Scanner;

public class zhanhuan 
{
	static void cha_16(int n)
	{
		if(n>=16) cha_16(n/16);
		if(n%16<10)
			System.out.print(n%16);
		else
			System.out.print((char)(n%16+55));
	}
	static void cha_2(int n)
	{
		if(n>=2)  cha_2(n/2);		
			System.out.print(n%2);	
	}
	static void cha_8(int n)
	{
		if(n>=8) {  cha_8(n/8);		
			System.out.print(n%8);
		}
		else
			System.out.print(n);
	}
	public static void main(String[] args) 
	{
		Scanner I=new Scanner(System.in);
		System.out.println("������1");
		int num1=I.nextInt();
		System.out.println("ʮ������"+num1+"ת����ʮ�����ƣ�");
		cha_16(num1);
		System.out.println("������2");
		int num2=I.nextInt();
		System.out.println("ʮ������"+num2+"ת���ɶ����ƣ�");
		cha_2(num2);
		System.out.println("������3");
		int num3=I.nextInt();
		System.out.println("ʮ������"+num3+"ת���ɰ˽��ƣ�");
		cha_8(num3);
	}
}
