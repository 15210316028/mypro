package Zuche;

import java.util.Scanner;

public class Text 
{
	public static void main(String[] args)
	{
		Scanner I=new Scanner(System.in);
		JiSuan j=new JiSuan();
		System.out.print("请选择租车类型（轿车（car）或客车（bus））：");
		String kind=I.next();
		MotoVehicleFactory mf=j.kind(kind);		
		System.out.print("请输入租车时间：");
		int days=I.nextInt();
		mf.CalcRent(days);
	}
}
