package zuoYe1;

import java.util.Scanner;
/**
 * 
 * ֽ����ֽ
 * @author QM
 *
 */
public class PaperFactory implements Paper {
/**
 * 
 * ֽ������ѡ��   kind
 */
	Scanner I=new Scanner(System.in);
	String kind;
	public void kind() 
	{
		System.out.print("ѡ��ֽ��(1��A4  2��B5)��");
		int num=I.nextInt();
		switch(num)
		{
		case 1:
			kind="A4";
			break;
		case 2:
			kind="B5";
			break;
		default:
			System.out.print("ѡ������������ѡ��");
		}		
	}

}
