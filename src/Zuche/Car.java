package Zuche;

import java.util.Scanner;

/**
 * 
 * �γ�����
 * @author QM
 *
 */
public final class Car extends MotoVehicleFactory 
{
	String type;//�γ�����
	double rent;//�γ����
	
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
 * ����γ��޲η���
 * 	
 */
	public Car()
	{
		super();
	}
/*
 * ����γ��вη���
 * 	
 */
	public Car(String type)
	{
		super();
		this.type=type;		
	}

/*
 * 
 * 	�γ����޼��㷽��
 * @see Zuche.MotoVehicle#CalcRent(int)
 */	
	
	public double CalcRent(int days)
	{
		Scanner I=new Scanner(System.in);
		
		System.out.print("��ѡ��γ�����(1����������GL8 2������550i 3�����������)��");
		int num=I.nextInt();
		switch(num)
		{
		case 1:
			type="��������GL8";			
			rent=600*days;
			break;
		case 2:
			type="����550i";			
			rent=500*days;
			break;
		case 3:
			type="���������";		
			rent=300*days;
			break;
		default:
			System.out.println("ѡ������������ѡ��");
			return CalcRent(days);
		}
		System.out.println("��"+type+"�ͽγ���"+days+"�죬�⳵��"+rent);
		return rent;		
	}
}
