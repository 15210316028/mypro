package Phone;

import java.util.Scanner;

public class Text 
{
	public static void main(String[] zhu) 
	{		
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎来到本手机店");
		System.out.println("*****************");		
		System.out.print("请选择你想要的手机品牌(1:三星(s)    2：苹果(p)    3：小米(m))：");
		int b = input.nextInt();
		PhoneFactory Factory=new PhoneFactory();
		Phone n=Factory.kind(b);
		PhoneBiz p=new PhoneBiz();
		p.kind(n);
	}
}
