package Zuche;
/**
 * 
 * ��������������
 * @author QM
 *
 */
public class MotoVehicleFactory implements MotoVehicle 
{
/*
 * ����������
 * 	
 */
	private String No;//���ƺ�
	private String Brand;//����Ʒ��
	private String Color;//������ɫ
	private String Mileage;//�⳵�е�������·�̣�
	
public String getNo() {
		return No;
	}

	public void setNo(String no) {
		No = no;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getMileage() {
		return Mileage;
	}

	public void setMileage(String mileage) {
		Mileage = mileage;
	}

/*
 * 
 * 	���������޼��㷽��
 * @see Zuche.MotoVehicle#CalcRent(int)
 */
	public double CalcRent(int days) 
	{
		return 0;
	} 
	

}
