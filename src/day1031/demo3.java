package day1031;

import java.util.Scanner;

public class demo3 
{
	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);
		System.out.println("������Ϸƽ̨����Ϸ��֧��\n");
		System.out.println("ѡ����Ϸ����:");
		System.out.println("\t1������\n\t2�����о���");
		int yx=I.nextInt();
		System.out.println("������Ϸʱ��");
		int sj=I.nextInt();
		switch(yx)
		{
		case 1:
			if(sj>=10)
			{
				System.out.println("�����"+yx+"��Ϸ��ʱ���ǣ�"+sj+"������"+5+"���Ż�");
				System.out.println("֧��"+sj*10*0.5+"��Ϸ��");
			}
			else
			{
				System.out.println("�����"+yx+"��Ϸ��ʱ���ǣ�"+sj+"������"+5+"���Ż�");
				System.out.println("֧��"+sj*10*0.5+"��Ϸ��");
			}			
		break;
		default:
			if(sj>=10)
			{
				System.out.println("�����"+yx+"��Ϸ��ʱ���ǣ�"+sj+"������"+5+"���Ż�");
				System.out.println("֧��"+sj*10*0.5+"��Ϸ��");
			}
			else
			{
				System.out.println("�����"+yx+"��Ϸ��ʱ���ǣ�"+sj+"������"+5+"���Ż�");
				System.out.println("֧��"+sj*10*0.5+"��Ϸ��");
			}			
			
		}
	}
}
