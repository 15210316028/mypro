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
//			System.out.println("A4ֽ�Ѿ����");
//			break;
//		case 2:
//			kind="B5";
//			System.out.println("B5ֽ�Ѿ����");
//			break;
//		}
		if(kind.equals("y"))		
			System.out.println("A4ֽ�Ѿ����");		
		else		
			System.out.println("B5ֽ�Ѿ����");		
	}

}
