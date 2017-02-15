package day1102;

public class xinXiBiz 
{
	xinXi[] size;
	public void length(xinXi[] cd)
	{
		size=cd;
	}
	public void shows()
	{
		System.out.println("客户信息：");
		for(int i=0;i<size.length;i++)
		{
			System.out.println(size[i].name+"\t"+size[i].age+"\t"+size[i].find);
		}
	}
}
