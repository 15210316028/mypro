package Zuche;

import java.util.Scanner;

/**
 * 
 * �ͳ�����
 * @author QM
 *
 */
public final class Bus extends MotoVehicleFactory 
{
	int SeatCount;//�ͳ���λ��
	double rent;//�ͳ����
	
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
 * ����ͳ��޲η���	
 */
	public Bus()
	{
		super();
	}
/*
 * ����ͳ��вη���	
 */	
	public Bus(int SeatCount)
	{
		super();
		this.SeatCount=SeatCount;		
	}
/*
 * 
 * 	�ͳ����޼��㷽��
 * @see Zuche.MotoVehicle#CalcRent(int)
 */	
	public double CalcRent(int days)
	{
		Scanner I=new Scanner(System.in);
		double rent=0;
		System.out.print("��ѡ�������(1���𱭣���λ16�� 2����������λ24��)��");
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
			System.out.println("ѡ������������ѡ��");
			return CalcRent(days);
		}
		System.out.println("��"+SeatCount+"��λ�ͳ���"+days+"�죬�⳵��"+rent);
		return rent;		
	} 
}
