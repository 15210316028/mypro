package Phone;


public class Phone  extends PhoneFactory
{
	private String kind;//�ֻ���Ʒ��
	private String Price;//�ֻ��ļ۸�
	private String Color;//�ֻ�����ɫ
	private String Size;//�ֻ��Ĵ�С
	private String Economy;//�ֻ���ϵͳ 
	
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
