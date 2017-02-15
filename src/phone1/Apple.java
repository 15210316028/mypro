package phone1;

public class Apple extends phone
{
	static final int price=6500;
	 static final String economy="IOS";
	public Apple()
	{
		
	}
	public Apple(String color,String kind)throws Exception
	{		
		super.setColor(color);
		super.setSize(kind);
	}
	public void show()throws Exception 
	{		
		System.out.println("您购买的手机是："+super.getKind()+",价格为"+price+",颜色是"+super.getColor()+",系统为"+economy);
	}
	
}
