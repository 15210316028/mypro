package zuoYe1;

public class PrinterBlack extends Printer {


	/*
	 * ��ӡ����:String content ��ӡ����,String count��ӡ����,
	 */	
	@Override
	public void print()
	{		
		for(int i=0;i<super.getCount();i++)
		{
			System.out.println(super.getContent());
		}

	}

}
