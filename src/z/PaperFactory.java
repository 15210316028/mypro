package z;

import java.util.Scanner;

public class PaperFactory implements Paper {

	@Override
	public void kind(String kind) {
//		Scanner input = new Scanner(System.in);
//		int num=input.nextInt();
//		switch(num)
//		{
//		case 1:
//			kind="A4";
//			System.out.println("A4纸已经造出");
//			break;
//		case 2:
//			kind="B5";
//			System.out.println("B5纸已经造出");
//			break;
//		}
		if(kind.equals("y"))		
			System.out.println("A4纸已经造出");		
		else		
			System.out.println("B5纸已经造出");		
	}

}
