package Phone;

import java.util.Scanner;

public class Text 
{
	public static void main(String[] zhu) 
	{		
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ�������ֻ���");
		System.out.println("*****************");		
		System.out.print("��ѡ������Ҫ���ֻ�Ʒ��(1:����(s)    2��ƻ��(p)    3��С��(m))��");
		int b = input.nextInt();
		PhoneFactory Factory=new PhoneFactory();
		Phone n=Factory.kind(b);
		PhoneBiz p=new PhoneBiz();
		p.kind(n);
	}
}
