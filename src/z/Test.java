package z;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		System.out.print("�������ӡ���ݣ�");		
		String content = input.next();
		System.out.print("�������ӡ������");
		int count = input.nextInt();
		System.out.print("�Ƿ���Ҫ��ɫ��ӡ��y/n����");
		String color = input.next();
//		if(color.equals("y"))		
//			color = "��ɫ";
//		else
//			color = "�ڰ�";		
		System.out.print("�Ƿ���A4ֽ��y/n����");
		String kind = input.next();
//		if(kind.equals("y"))		
//			kind = "A4";
//		else
//			kind = "B5";		
		PriterFactory pf = new PriterFactory();
		Printer p = pf.getPrinter(kind);
		p.setBrand("����");
		p.setContent(content);
		p.setCount(count);
		p.setInkBox(new InkBoxFactory());
		p.setPaper(new PaperFactory());
		p.setColor(color);
		p.print();
	}

}
