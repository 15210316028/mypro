package zuoYe;

import java.util.Scanner;

public class textPet {

	public static void main(String[] args) {
		Scanner I=new Scanner(System.in);
		master m=new master();
		String yes;
		int Health = 100 ;
		int Love = 0 ;
		System.out.println("选择宠物类型（1、狗狗  2、企鹅）：");
		int num=I.nextInt();
		do{
			switch(num)
			{
			case 1:			
				m.pet(new dog());
				break;
			case 2:			
				m.pet(new qiE());				
				break;
			}
			Love=Love+5;
			Health=Health-10;			
			System.out.println("是否继续游戏（y/n）：");
			yes=I.next();
		}
		while(yes.equals("y"));
		System.out.println("游戏结束！");
		System.out.println("宠物健康值："+Health+"与主人亲密度："+Love);
	}

}
