package z;

import java.util.Scanner;

public class InkBoxFactory implements InkBox {

	@Override
	public void color(String color) {
//		Scanner input = new Scanner(System.in);
//		int num=input.nextInt();
//		switch(num)
//		{
//		case 1:
//			color="��ɫ";
//			System.out.println("��ɫī��");
//			break;
//		case 2:
//			color="�ڰ�";
//			System.out.println("�ڰ�ī��");
//			break;
//		}
		if(color.equals("y"))	
			System.out.println("��ɫī��");
		else				
			System.out.println("�ڰ�ī��");		
	}
	
}
