package day1111;

public class Age 
{
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Age()
	{
		
	}
	public Age(int age)
	{
		this.age = age;
	}
	public void show() throws Exception
	{
		if(age>0&&age<100)
		{
			System.out.println("���䣺"+age+"��");
		}
		else
		{
			throw new Exception("���������������룡");
		}
	}
}
