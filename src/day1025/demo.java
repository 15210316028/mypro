package day1025;

import java.util.Scanner;

	public class demo{

		public static void main(String args[])
		{
			System.out.println("********************");
			System.out.println("");
			System.out.println("��ѡ�������Ʒ��ţ�");
			System.out.println("1.T��(��245.0)  ����Ь(��570.0)  ������(��500.0)");
			System.out.println("********************");
			System.out.println("");
			double s=0;
			String d;
			do{
				System.out.println("��������Ʒ��ţ�");
				Scanner input=new Scanner(System.in);
				int a=input.nextInt();
					if(a==1)
					{System.out.println("�����빺��������");
					int b=input.nextInt();
					double c=245*b;
					System.out.println("T����245.0  ����:"+b+"  "+"�ϼ�:"+c);
					s=s+c;
					}
					else if(a==2)
					{System.out.println("�����빺��������");
					int b=input.nextInt();
					double c=570*b;
					System.out.println("����Ь��245.0  ����:"+b+"  "+"�ϼ�:"+c);
					s=s+c;
					}
					else if(a==3)
					{System.out.println("�����빺��������");
					int b=input.nextInt();
					double c=500*b;
					System.out.println("�����ģ�245.0  ����:"+b+"  "+"�ϼ�:"+c);
					s=s+c;
					}
					else 
					{System.out.println("�޴���Ʒ");}
					System.out.println("�Ƿ����(y/n)");
					d=input.next();				
				}
			while(d.equals("y"));
			Scanner input=new Scanner(System.in);
			int x=input.nextInt();
			double m=s*0.8;
			System.out.println("�ۿۣ�0.8");
			System.out.println("Ӧ����"+m);
			System.out.println("ʵ�ʽ�"+x);
			double p=x-m;
			System.out.println("��Ǯ��"+p);
	    	}
		
	}

