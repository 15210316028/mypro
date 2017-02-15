package day1107;

public class bus extends car
{
	public bus()
	{
		
	}
	public bus(String kind,String color,int age)
	{
		super.setKind(kind);		
		super.setColor(color);		
		super.setAge(age);		
	}
	public void show()
	{
		System.out.println(getColor()+getKind()+getAge());
	}
}
