package Zuche;

import java.util.Scanner;

public class Text 
{
	public static void main(String[] args)
	{
		Scanner I=new Scanner(System.in);
		JiSuan j=new JiSuan();
		System.out.print("��ѡ���⳵���ͣ��γ���car����ͳ���bus������");
		String kind=I.next();
		MotoVehicleFactory mf=j.kind(kind);		
		System.out.print("�������⳵ʱ�䣺");
		int days=I.nextInt();
		mf.CalcRent(days);
	}
}
