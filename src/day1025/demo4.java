package day1025;

import java.util.Scanner;

public class demo4 {

	public static void main(String[] zhu) {
		Scanner i = new Scanner(System.in);//声明键盘输入
		String a = "**********************************************";
		String b = "选择购买编号";
		String c = "1、T恤 ￥245";
		String d = "2、网球鞋 ￥300";
		String e = "3、网球拍 ￥500";
		System.out.println(a+"\n"+b+"\n"+c+"\t"+d+"\t"+e+"\n"+a);
		double m11 = 0;//定义购买产品总价
		String shi="y";
		do {
			
			System.out.println("输入商品编号：");
			int B = i.nextInt();//定义购买产品编号
			System.out.println("输入购买数量：");
			int s = i.nextInt();//定义购买产品数量
			switch (B) {
			case 1:
				double m1 = 245 * s;//购买编号1产品合计
				System.out.println(B+"数量"+s+"合计￥"+m1);
				m11 = m11 + m1;
				break;
			case 2:
				double m2 = 300 * s;//购买编号2产品合计
				System.out.println(B+"数量"+s+"合计￥"+m2);
				m11 = m11 + m2;
				break;
			case 3:
				double m3 = 500 * s;//购买编号3产品合计
				System.out.println(B+"数量"+s+"合计￥"+m3);
				m11 = m11 + m3;
				break;
			default:
				System.out.println("选择错误，请重新购买");
				break;
			}
			System.out.println("是（y）否(n)继续购买");
			shi = i.next();
		} 
		while (shi.equals("y"));
		double dz = 0.8;
		double m = m11 * dz;//计算打折后总价	（应付金额）	
		System.out.println("输入金额");
		double g = i.nextDouble();//实付金额
		double z = g - m;//计算找零
		System.out.println("折扣："+dz+"\n应付金额：￥"+m+"\n实付金额：￥"+g+"\n"+"找零：￥"+z);
	}

}
