package zuoYe;

import java.util.Scanner;

public class textPet {

	public static void main(String[] args) {
		Scanner I=new Scanner(System.in);
		master m=new master();
		String yes;
		int Health = 100 ;
		int Love = 0 ;
		System.out.println("ѡ��������ͣ�1������  2����죩��");
		int num=I.nextInt();
		do{
			switch(num)
			{
			case 1:			
				m.pet(new dog());
				break;
			case 2:			
				m.pet(new qiE());				
				break;
			}
			Love=Love+5;
			Health=Health-10;			
			System.out.println("�Ƿ������Ϸ��y/n����");
			yes=I.next();
		}
		while(yes.equals("y"));
		System.out.println("��Ϸ������");
		System.out.println("���｡��ֵ��"+Health+"���������ܶȣ�"+Love);
	}

}
