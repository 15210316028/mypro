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
		System.out.println("����Ϣ");
	}
	public void call()
	{
		System.out.println("��绰");
	}
	public void info()
	{
		System.out.println("����Ϣ");
	}
	public void show()
	{
		System.out.println("����һ��"+brand+"��"+type+"���ֻ���");
	}
}
