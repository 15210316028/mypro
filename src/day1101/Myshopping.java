package day1101;

import java.util.Scanner;

public class Myshopping 
{
	Scanner I=new Scanner(System.in);
	String xi="***************************";
	String xz1="��ѡ���������֣�";
	String xz2="��ѡ���������ֻ�0������һ���˵���";
	
	String A="��ӭ��½ϵͳ";
	String B="1����¼ϵͳ";
	String C="2���˳�";
	
	String D="1���ͻ���Ϣ����";
	String E="2���������";
	
	String F="1�����˴����";
	String G="2�����˳齱";
	String H="3�������ʺ�";
		
	String name="****";
	int miMa=111111;
	public void denglu()
	{
		System.out.println("\t"+A+"\n\t"+B+"\n\t"+C+"\n"+xi);
		System.out.println(xz1);
		int num1;
		num1=I.nextInt();
		switch(num1)
		{
		case 1:
			for(int i=2;i>=0;i--)
			{
				System.out.println("�������û�����");
				name=I.next();
				System.out.println("���������룺");
				miMa=I.nextInt();						
				if(!name.equals("****")||miMa!=111111)
					{
						System.out.println("����������������");
						System.out.println("��ʣ"+i+"�λ���");															
						if(i==0)
						{
							System.out.println("�����ù⣬��ϵ�ͷ�����");
							break;
						}
					}
				else
				{					
					System.out.println("��ӭ��½");
					zhucaidan();
					break;
				}
			}
			break;
		case 2:
			System.out.println("ллʹ�ã�");
			break;
		}		
	}
	public void zhucaidan()
	{
		System.out.println("\t"+D+"\n\t"+E+"\n"+xi);
		System.out.println(xz2);
		int num2;
		num2=I.nextInt();
		switch(num2)
		{
		case 1:
			break;
		case 2:
			huikui();
			break;
		default:
			denglu();
			break;
		}
	}
	public void huikui()
	{
		System.out.println("\t"+F+"\n\t"+G+"\n\t"+H+"\n"+xi);
		System.out.println(xz2);
		int num3;
		num3=I.nextInt();
		switch(num3)
		{
		case 1:
			System.out.println("���˴����");			
			break;
		case 2:
			System.out.println("���˳齱");
			break;
		case 3:
			System.out.println("�����ʺ�");
			break;
		default:
			zhucaidan();
			break;
		}		
	}					
}
