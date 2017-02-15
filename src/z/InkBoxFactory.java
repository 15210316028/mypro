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
//			color="²ÊÉ«";
//			System.out.println("²ÊÉ«Ä«ºÐ");
//			break;
//		case 2:
//			color="ºÚ°×";
//			System.out.println("ºÚ°×Ä«ºÐ");
//			break;
//		}
		if(color.equals("y"))	
			System.out.println("²ÊÉ«Ä«ºÐ");
		else				
			System.out.println("ºÚ°×Ä«ºÐ");		
	}
	
}
