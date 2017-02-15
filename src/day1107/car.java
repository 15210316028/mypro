package day1107;

public class car 
{
	private String kind;
	private String color;
	private int site;
	private int age;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSite() {
		return site;
	}
	public void setSite(int site) {
		this.site = site;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public car()
	{
		
	}
	public car(String kind,String color,int site,int age)
	{
		this.kind =kind;		
		this.color =color;
		this.site =site;	
		this.age =age;
		
	}
}
