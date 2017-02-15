package z;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		System.out.print("请输入打印内容：");		
		String content = input.next();
		System.out.print("请输入打印分数：");
		int count = input.nextInt();
		System.out.print("是否需要彩色打印（y/n）：");
		String color = input.next();
//		if(color.equals("y"))		
//			color = "彩色";
//		else
//			color = "黑白";		
		System.out.print("是否用A4纸（y/n）：");
		String kind = input.next();
//		if(kind.equals("y"))		
//			kind = "A4";
//		else
//			kind = "B5";		
		PriterFactory pf = new PriterFactory();
		Printer p = pf.getPrinter(kind);
		p.setBrand("三星");
		p.setContent(content);
		p.setCount(count);
		p.setInkBox(new InkBoxFactory());
		p.setPaper(new PaperFactory());
		p.setColor(color);
		p.print();
	}

}
