package day1109;

public class Handset {
	private String brand;
	private String type;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void sendinfo()
	{
		System.out.println("发信息");
	}
	public void call()
	{
		System.out.println("打电话");
	}
	public void info()
	{
		System.out.println("收信息");
	}
	public void show()
	{
		System.out.println("这是一个"+brand+"牌"+type+"型手机！");
	}
}
