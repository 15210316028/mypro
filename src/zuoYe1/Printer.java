package zuoYe1;
/**
 * 
 * ����Ĵ�ӡ��
 * @author QM
 *
 */
public abstract class Printer 
{	
	private String brand;//��ӡ��Ʒ��
	private String content ;//��ӡ����
	private int count ;//��ӡ����
	private String kind;//ֽ������
	private InkBox inkBox;//��ӡ��ī�г���
	private Paper paper;//��ӡ��ֽ�ų���
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public InkBox getInkBox() {
		return inkBox;
	}
	public void setInBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	public abstract void print();
}
