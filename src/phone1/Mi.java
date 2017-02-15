package phone1;

public class Mi extends phone
{
	 static final int price=1200;
	 static final String economy="安卓6.0";
	public Mi()
	{
		
	}
	public Mi(String color,String kind)throws Exception
	{
		super.setColor(color);
		super.setKind(kind);
		
	}
	public void show()throws Exception 
	{		
		System.out.println("您购买的手机是："+super.getKind()+",价格为"+price+",颜色是"+super.getColor()+",系统为"+economy);
	}
}
