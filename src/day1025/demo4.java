package day1025;

import java.util.Scanner;

public class demo4 {

	public static void main(String[] zhu) {
		Scanner i = new Scanner(System.in);//������������
		String a = "**********************************************";
		String b = "ѡ������";
		String c = "1��T�� ��245";
		String d = "2������Ь ��300";
		String e = "3�������� ��500";
		System.out.println(a+"\n"+b+"\n"+c+"\t"+d+"\t"+e+"\n"+a);
		double m11 = 0;//���幺���Ʒ�ܼ�
		String shi="y";
		do {
			
			System.out.println("������Ʒ��ţ�");
			int B = i.nextInt();//���幺���Ʒ���
			System.out.println("���빺��������");
			int s = i.nextInt();//���幺���Ʒ����
			switch (B) {
			case 1:
				double m1 = 245 * s;//������1��Ʒ�ϼ�
				System.out.println(B+"����"+s+"�ϼƣ�"+m1);
				m11 = m11 + m1;
				break;
			case 2:
				double m2 = 300 * s;//������2��Ʒ�ϼ�
				System.out.println(B+"����"+s+"�ϼƣ�"+m2);
				m11 = m11 + m2;
				break;
			case 3:
				double m3 = 500 * s;//������3��Ʒ�ϼ�
				System.out.println(B+"����"+s+"�ϼƣ�"+m3);
				m11 = m11 + m3;
				break;
			default:
				System.out.println("ѡ����������¹���");
				break;
			}
			System.out.println("�ǣ�y����(n)��������");
			shi = i.next();
		} 
		while (shi.equals("y"));
		double dz = 0.8;
		double m = m11 * dz;//������ۺ��ܼ�	��Ӧ����	
		System.out.println("������");
		double g = i.nextDouble();//ʵ�����
		double z = g - m;//��������
		System.out.println("�ۿۣ�"+dz+"\nӦ������"+m+"\nʵ������"+g+"\n"+"���㣺��"+z);
	}

}
