package z;

public class PrinterBlack extends Printer{
	
	/*
	 * ��ӡ����String context ��ӡ����,String count��ӡ����,String wc��ӡ�Ƿ��ӡ,String kind ��ӡֽ��С
	 */
	public void print()
	{
		super.getInkBox().color("�ڰ�");
		super.getPaper().kind(super.getColor());
		for(int i=0;i<super.getCount();i++)
		{
			System.out.println(super.getContent());
		}
	}

}
