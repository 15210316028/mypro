package Zuche;
/**
 * 
 * 机动车生产工厂
 * @author QM
 *
 */
public class MotoVehicleFactory implements MotoVehicle 
{
/*
 * 机动车属性
 * 	
 */
	private String No;//车牌号
	private String Brand;//车的品牌
	private String Color;//车的颜色
	private String Mileage;//租车行的里数（路程）
	
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
 * 	机动车租赁计算方法
 * @see Zuche.MotoVehicle#CalcRent(int)
 */
	public double CalcRent(int days) 
	{
		return 0;
	} 
	

}
