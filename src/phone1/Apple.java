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
		System.out.println("��������ֻ��ǣ�"+super.getKind()+",�۸�Ϊ"+price+",��ɫ��"+super.getColor()+",ϵͳΪ"+economy);
	}
	
}
