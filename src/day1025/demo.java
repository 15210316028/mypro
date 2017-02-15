package day1025;

import java.util.Scanner;

	public class demo{

		public static void main(String args[])
		{
			System.out.println("********************");
			System.out.println("");
			System.out.println("请选择购买的商品编号：");
			System.out.println("1.T恤(￥245.0)  网球鞋(￥570.0)  网球拍(￥500.0)");
			System.out.println("********************");
			System.out.println("");
			double s=0;
			String d;
			do{
				System.out.println("请输入商品编号：");
				Scanner input=new Scanner(System.in);
				int a=input.nextInt();
					if(a==1)
					{System.out.println("请输入购买数量：");
					int b=input.nextInt();
					double c=245*b;
					System.out.println("T恤￥245.0  数量:"+b+"  "+"合计:"+c);
					s=s+c;
					}
					else if(a==2)
					{System.out.println("请输入购买数量：");
					int b=input.nextInt();
					double c=570*b;
					System.out.println("网球鞋￥245.0  数量:"+b+"  "+"合计:"+c);
					s=s+c;
					}
					else if(a==3)
					{System.out.println("请输入购买数量：");
					int b=input.nextInt();
					double c=500*b;
					System.out.println("网球拍￥245.0  数量:"+b+"  "+"合计:"+c);
					s=s+c;
					}
					else 
					{System.out.println("无此商品");}
					System.out.println("是否继续(y/n)");
					d=input.next();				
				}
			while(d.equals("y"));
			Scanner input=new Scanner(System.in);
			int x=input.nextInt();
			double m=s*0.8;
			System.out.println("折扣：0.8");
			System.out.println("应付金额："+m);
			System.out.println("实际金额："+x);
			double p=x-m;
			System.out.println("找钱："+p);
	    	}
		
	}

