package day1031;

import java.util.Scanner;

public class demo5 
{
	public static void main(String[] zhu) 
	{
	Scanner I=new Scanner(System.in);
	String yes="y";
	String yhm="*****";//�û���
	int mm=111111;//����
	int hyh;//��Ա��
	int sj;
	int max=9999;
	int min=1000;
	int sum=0;
	do
	{								
		System.out.println("******��ӭ���뽱�˸���ϵͳ******");
		System.out.println("\t1��ע��");
		System.out.println("\t2����½");
		System.out.println("\t3���齱");
		System.out.println("**************************");
		System.out.print("��ѡ��˵���");		
		int xz=I.nextInt();
		switch(xz)
			{	
			case 1:
				System.out.println("ע��");
				System.out.println("����ע����Ϣ��");
				System.out.print("�û�����");
				yhm=I.next();
				System.out.print("�û����룺");
				mm=I.nextInt();
				hyh=(int)(Math.random()*(max-min)) +min;
				System.out.println("ע��ɹ������ס��Ա��");
				System.out.println(yhm+"\t"+mm+"\t"+hyh);
				break;
			case 2:
				System.out.println("��½");
				for(int i=2;i>=0;i--)
				{
					System.out.println("�������û�����");
					yhm=I.next();
					System.out.println("�������û����룺");
					mm=I.nextInt();										
					if((!yhm.equals("*****"))||(mm!=111111))
					{
						System.out.println("�����������������룡����"+i+"�λ���");
						if(i==0)
						{
							System.out.println("�����ù⣬����ϵ�ͷ�������");
							break;
						}						
					}					
					else
					{
						sum++;
						System.out.println("��ӭ��½��");						
						break;
					}										
				}
				break;
			case 3:
				if(sum==1)
				{
				System.out.println("�齱");
				System.out.println("���������Ļ�Ա��");
				hyh=I.nextInt();
				System.out.println("�����������ǣ�");
				for(int j=0;j<5;j++)
				{
					sj=(int)(Math.random()*(max-min)) +min;
					System.out.print(sj+" ");
					if(hyh==sj)
					{
						System.out.print("��ϲ�㣬���Ǳ��������ǣ���ý�Ʒһ��");
					}
					else
					{
						System.out.print("���ź��������ǽ���������");
					}
				}
				}
				else
				{
					System.out.println("���ȵ�¼");
				}
				break;
				default:		
					System.out.println("����������");
			}
	
		System.out.println("\n�Ƿ������y/n��:");
		yes=I.next();
	}
	while(yes.equals("y"));
	System.out.println("ϵͳ�˳���ллʹ�ã�");
	
	}
}
