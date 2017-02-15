package zuoYe1;
/**
 * 
 * 抽象的打印机
 * @author QM
 *
 */
public abstract class Printer 
{	
	private String brand;//打印机品牌
	private String content ;//打印内容
	private int count ;//打印份数
	private String kind;//纸张种类
	private InkBox inkBox;//打印机墨盒厂商
	private Paper paper;//打印机纸张厂商
	
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
