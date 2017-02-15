package zuoYe1;

import java.util.Scanner;
/**
 * 
 * 墨盒厂产墨盒
 * @author QM
 *
 */
public class InkBoxFactory implements InkBox {
/**
 * 
 * 墨盒类型选择   kind
 */
	Scanner I=new Scanner(System.in);
	String kind;
	public void kind() 
	{
		System.out.print("选择墨盒（1、黑白   2、彩色）：");
		int num=I.nextInt();
		switch(num)
		{
		case 1:
			kind="黑白";
			break;
		case 2:
			kind="彩色";
			break;
		default:
			System.out.print("选择有误，请重新选择！");
		}		
	}	
}
