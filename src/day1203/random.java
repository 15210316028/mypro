package day1203;

import java.util.Scanner;

public class random {

	public static void main(String[] args) 
	{
		int random=(int) (Math.random()*100);
	
		Scanner I=new Scanner(System.in);
		while(true)
		{			
			System.out.print("��������һ������");
			int num=I.nextInt();
			if(num>random)
			{
				System.out.println("�´��ˣ��������С!");
			}
			if(num<random)
			{
				System.out.println("�´��ˣ����������!");
			}
			if(num==random)
			{
				System.out.println("��ϲ�㣬�����!");
				break;
			}
			System.out.println("�Ƿ������y/n��");
			String yes=I.next();
			if(yes.equals("y"))
			{
				continue;
			}
			else
			{
				System.out.println("ллʹ�ã�");
				break;
			}
		}
		
	}

}
