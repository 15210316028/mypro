package day1107;

import java.util.Scanner;

public class dengLu 
{

	public static void main(String[] args) 
	{
		Scanner I=new Scanner(System.in);	
		xiTong a=new xiTong();
		System.out.println("��ӭ��¼ϵͳ��");
		while(true)
		{
			System.out.println("ѡ�����");
			System.out.println("1��ע��\n2����½\n3���޸�����");			
			int num=I.nextInt();
			switch(num)
			{
			case 1:
				a.zhuCe();
				break;
			case 2:
				a.dengLu();
				break;
			case 3:
				a.xiuGai();
				break;
			}		
		}
	}
}
