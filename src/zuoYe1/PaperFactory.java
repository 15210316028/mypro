package zuoYe1;

import java.util.Scanner;
/**
 * 
 * 纸厂产纸
 * @author QM
 *
 */
public class PaperFactory implements Paper {
/**
 * 
 * 纸质类型选择   kind
 */
	Scanner I=new Scanner(System.in);
	String kind;
	public void kind() 
	{
		System.out.print("选择纸型(1、A4  2、B5)：");
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
			System.out.print("选择有误，请重新选择！");
		}		
	}

}
