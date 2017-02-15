package zuoYe1;

import java.util.Scanner;
public class Text {

	public static void main(String[] zhu) 
	{
		Scanner I = new Scanner(System.in);
		PrinterFactory factory = new PrinterFactory();
		String yes;
		do{
			System.out.print("请输入打印内容：");	
			String content = I.next();
			System.out.print("请输入打印分数：");
			int count = I.nextInt();		
			
			
			Printer p = factory.getPrinter(count);
			p.setBrand("三星");
			p.setContent(content);
			p.setCount(count);
			p.print();			
			System.out.print("是否继续（y/n）：");
			yes=I.next();
			int num = 0;
			if(num==1||num==2)
			{
				
				break;
			}
			else
			{
				continue;
			}
		}
		while(yes.equals("y"));
		

	}

}
