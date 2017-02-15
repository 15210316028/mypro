package phone1;

public abstract class phone 
{
	private String kind;//手机的品牌
	private String price;//手机的价格
	private String color;//手机的颜色
	private String size;//手机的大小
	private String economy;//手机的系统 
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getEconomy() {
		return economy;
	}

	public void setEconomy(String economy) {
		this.economy = economy;
	}

	public abstract  void show() throws Exception;
}
