package day1029;

import java.util.Scanner;

public class demo7 
{
	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);		
		double qk = 0,dk = 0,yk=10000,ATM=20000;//ÿ��ȡǮ���  ȡ�����н�� ���  ATM���н��
		String yhm="****";
		int mm=111111;
		int kh=123456789;
		String yes="y";
		System.out.println("��ӭ��¼ϵͳ");
		for(int j=2;j>=0;j--)
		{
			System.out.print("�����뿨�ţ�");
			kh=I.nextInt();
			System.out.print("�������룺");
			mm=I.nextInt();
			if(kh==111111&&mm==123456789)
			{	
				do
				{
					System.out.println("1����ѯ\n2��ȡ��\n3���˳�");
					System.out.print("ѡ��Ҫ�����ҵ��");
					int num=I.nextInt();										
						switch(num)
						{
						case 1:
							System.out.println("�����û���Ϊ��"+yhm+"��"+"���Ͻ��Ϊ"+yk);
						break;
						case 2:				
							do
							{
								System.out.println("����ȡ���");
								qk=I.nextInt();			
								if(qk%100==0)
								{				
									if(qk>3000)
									{					
										System.out.println("ȡǮʧ�ܣ�������ȣ�");	
										continue;
									}
									else
									{	
										if(yk>=100&&qk<=yk&&qk<=ATM)
										{		
											dk=dk+qk;						
											System.out.println("ȡǮ:"+qk+"�����"+(yk-qk));
											yk=yk-qk;
										}
										else 
										{		
											System.out.println("ȡǮʧ�ܣ����㣡");
											continue;
										}																									
									}								
								}
								else
								{
									System.out.println("����ʧ�ܣ�������ȷ��");				
								}							
								System.out.println("�Ƿ����ȡ�y/n��:");
								yes=I.next();
								
							}
							while(yes.equals("y"));																	
							break;																			
					case 3:
						System.out.println("��ȫ�˳���ллʹ�ã�");
						break;
					default:
						System.out.println("����ʧ�ܣ�������ȷѡ��");
					}						
				System.out.println("�Ƿ����ҵ��y/n��:");
				 yes=I.next();
				 break;
				}
				while(yes.equals("y"));										
				System.out.println("��ȫ�˳���ллʹ�ã�");				
			}
			else
			{			
				System.out.println("��������������ȷ���ź����룡����"+j+"�λ���");
				if(j==0)
				{
					System.out.println("�����ù⣬��ϵ��̨����");
					continue;
				}														
			}
		}
		
	}
}
