package z;

public abstract class Printer{
	

	private String brand;//��ӡ��Ʒ��
	private String content;//��ӡ����
	private int count;//��ӡ����
	private String color;//ֽ������
	private InkBox inkBox;//��ӡ��ī�г���
	private Paper paper;//��ӡ��ֽ�ų���	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public InkBox getInkBox() {
		return inkBox;
	}
	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}	
	public abstract void print();
}
