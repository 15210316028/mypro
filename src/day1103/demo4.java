package day1103;

import java.util.Scanner;

public class demo4 
{

	public static void main(String[] args)
	{
		Scanner I=new Scanner(System.in);
		int sum = 0;//����Ҫ�ҵ��ֵĸ���
		System.out.println("�����ַ�����");//����һ�仰
		String juzi=I.next();
		System.out.println("����Ҫ�����ĸ��");//����Ҫ�ҵ���
		String zimu=I.next();
		StringBuffer zifu=new StringBuffer(juzi);
		String[] s=new String[juzi.length()];//��������ÿ���ַ�����Ԫ�ع�������		
		for(int i=0;i<juzi.length()-1;i++)//������ÿ���ַ�����������飨�ַ����С�������
		{			
			zifu.insert(i,",");
		}
		String a=zifu.toString();
		s=a.split(",");//���ַ���ġ�����ȥ�����Ա�������
		for(int i=0;i<s.length;i++)//������Ҫ�������ĸ����
		{
			if(s[i].equals(zimu))
				sum++;
		}
		System.out.println(juzi+"����"+sum+"��"+zimu);
	}

}
