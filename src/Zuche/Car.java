package Zuche;

import java.util.Scanner;

/**
 * 
 * 轿车生产
 * @author QM
 *
 */
public final class Car extends MotoVehicleFactory 
{
	String type;//轿车车型
	double rent;//轿车租金
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
/*
 * 构造轿车无参方法
 * 	
 */
	public Car()
	{
		super();
	}
/*
 * 构造轿车有参方法
 * 	
 */
	public Car(String type)
	{
		super();
		this.type=type;		
	}

/*
 * 
 * 	轿车租赁计算方法
 * @see Zuche.MotoVehicle#CalcRent(int)
 */	
	
	public double CalcRent(int days)
	{
		Scanner I=new Scanner(System.in);
		
		System.out.print("请选择轿车类型(1：别克商务舱GL8 2：宝马550i 3：别克林荫大道)：");
		int num=I.nextInt();
		switch(num)
		{
		case 1:
			type="别克商务舱GL8";			
			rent=600*days;
			break;
		case 2:
			type="宝马550i";			
			rent=500*days;
			break;
		case 3:
			type="别克林荫大道";		
			rent=300*days;
			break;
		default:
			System.out.println("选择有误，请重新选择！");
			return CalcRent(days);
		}
		System.out.println("租"+type+"型轿车，"+days+"天，租车金额："+rent);
		return rent;		
	}
}
