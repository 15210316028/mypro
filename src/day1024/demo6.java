package day1024;

import java.util.Scanner;

public class demo6 {

	public static void main(String[] zhu)
	{
		Scanner input1=new Scanner(System.in);
		System.out.println("�������Ա�ţ�");
		double hao=input1.nextDouble();
		Scanner input2=new Scanner(System.in);
		System.out.println("�������Ա���գ�");
		String shengRi=input2.next();
		Scanner input3=new Scanner(System.in);
		System.out.println("��������֣�");
		double fen=input3.nextDouble();
		System.out.println("��Ա��\t\t"+"����\t\t"+"����\n"+hao+"\t\t"+shengRi+"\t\t"+fen);
		int gewei = (int) (hao%10); 
		int shiwei = (int) (hao/10%10); 
		int baiwei = (int) (hao/100%10); 
		int qianwei = (int) (hao/1000);
		int num=gewei+shiwei+baiwei+qianwei;
		System.out.println(num);				
		int random=(int) (Math.random()*40);		
		if(random==num)
		{
			System.out.println("�������û�������MP3һ��");
		}
		else
		{
			System.out.println("лл�ݹ�");
		}
	}

}
