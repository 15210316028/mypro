package Zuche;

import java.util.Scanner;

/**
 * 
 * 客车生产
 * @author QM
 *
 */
public final class Bus extends MotoVehicleFactory 
{
	int SeatCount;//客车座位数
	double rent;//客车租金
	
	public int getSeatCount() {
		return SeatCount;
	}
	public void setSeatCount(int seatCount) {
		SeatCount = seatCount;
	}
	
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
/*
 * 构造客车无参方法	
 */
	public Bus()
	{
		super();
	}
/*
 * 构造客车有参方法	
 */	
	public Bus(int SeatCount)
	{
		super();
		this.SeatCount=SeatCount;		
	}
/*
 * 
 * 	客车租赁计算方法
 * @see Zuche.MotoVehicle#CalcRent(int)
 */	
	public double CalcRent(int days)
	{
		Scanner I=new Scanner(System.in);
		double rent=0;
		System.out.print("请选择客类型(1：金杯（座位16） 2：金龙（座位24）)：");
		int num=I.nextInt();
		switch(num)
		{
		case 1:
			SeatCount=16;
			rent=800*days;
			break;
		case 2:
			SeatCount=24;
			rent=1500*days;
			break;		
		default:
			System.out.println("选择有误，请重新选择！");
			return CalcRent(days);
		}
		System.out.println("租"+SeatCount+"座位客车，"+days+"天，租车金额："+rent);
		return rent;		
	} 
}
