package z;

public class PrinterColor extends Printer{
	
	/*
	 * ��ӡ����String context ��ӡ����,String count��ӡ����,String wc��ӡ�Ƿ��ӡ,String kind ��ӡֽ��С
	 */
	public void print()
	{
		super.getInkBox().color("��ɫ");
		super.getPaper().kind(super.getColor());
		for(int i=0;i<super.getCount();i++)
		{
			System.out.println(super.getContent());
		}
	}

}
