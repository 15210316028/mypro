package phone1;

public class SAMSUNG extends phone 
{
	static final int price=6500;
	 static final String economy="android";
	public SAMSUNG()
	{
		
	}
	public SAMSUNG(String color,String kind)throws Exception
	{
		super.setColor(color);
		super.setKind(kind);
	}
	public void show()throws Exception 
	{		
		System.out.println("��������ֻ��ǣ�"+super.getKind()+",�۸�Ϊ"+price+",��ɫ��"+super.getColor()+",ϵͳΪ"+economy);
	}
}
