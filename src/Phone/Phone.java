package Phone;


public class Phone  extends PhoneFactory
{
	private String kind;//手机的品牌
	private String Price;//手机的价格
	private String Color;//手机的颜色
	private String Size;//手机的大小
	private String Economy;//手机的系统 
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public String getEconomy() {
		return Economy;
	}
	public void setEconomy(String economy) {
		Economy = economy;
	}
}
