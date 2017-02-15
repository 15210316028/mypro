package day1104;
public class chongWu
{
	private String name;
	private String kind;
	private int age;
	private String lei;
	private int health;		
	public chongWu()
	{		
	}
	public chongWu(String name,String lei,String kind,int age,int health)
	{
		this.name=name;
		this.lei=lei;
		this.kind=kind;
		this.age=age;
		this.health=health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLei() {
		return lei;
	}
	public void setLei(String lei) {
		this.lei = lei;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}	
}
