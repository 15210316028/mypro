package phone1;

public abstract class phone 
{
	private String kind;//�ֻ���Ʒ��
	private String price;//�ֻ��ļ۸�
	private String color;//�ֻ�����ɫ
	private String size;//�ֻ��Ĵ�С
	private String economy;//�ֻ���ϵͳ 
	
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
