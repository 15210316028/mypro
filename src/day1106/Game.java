package day1106;

import java.util.Scanner;

public class Game 
{
	Scanner I=new Scanner(System.in);
	String name;//��������
	int count;//��Ϸ����
	int result;//��¼��ȭ���
	int sum;//��¼����ܷ���	
	int SUM;//��¼�����ܷ���	
	public int calcResult()//�ܷ����Ƚ�
	{
		if(sum>SUM)
			result=1;
		else if(sum<SUM)
			result=2;
		else
			result=3;
		return result;		
	}
	public void showResult()
	{
		switch(calcResult())
		{
		case 1:
			System.out.print("��ϲ��ϲ��");
			break;
		case 2:
			System.out.print("�Ǻǣ��������´μ��Ͱ���");
			break;
		case 3:
			System.out.print("�;֣���˥���ٺ٣������ưɣ�");
			break;
		}
	}
	public void startGame()
	{
		System.out.println("��ӭ������Ϸ����");
		System.out.println("***********");
		System.out.println("**��ȭ����ʼ**");
		System.out.println("***********");
		System.out.println("��ȭ����1������ 2��ʯͷ 3����");
	}
}
