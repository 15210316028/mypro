package phone1;

public class Mi extends phone
{
	 static final int price=1200;
	 static final String economy="��׿6.0";
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
		System.out.println("��������ֻ��ǣ�"+super.getKind()+",�۸�Ϊ"+price+",��ɫ��"+super.getColor()+",ϵͳΪ"+economy);
	}
}
