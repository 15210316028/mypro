package day1109;
import java.util.Scanner;
public class door1 extends Door implements lock,mao {
	Scanner I=new Scanner(System.in);
	@Override
	public void open2() {
		// TODO Auto-generated method stub
		System.out.println("锁开了");
	}

	@Override
	public void close2() {
		// TODO Auto-generated method stub
		System.out.println("锁关了");
	}

	@Override
	public void open1() {
		// TODO Auto-generated method stub
		System.out.println("门开了");
	}

	@Override
	public void close1() {
		// TODO Auto-generated method stub
		System.out.println("门关了");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("通过了猫眼");
	}

}
