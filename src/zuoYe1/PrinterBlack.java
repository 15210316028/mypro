package zuoYe1;

public class PrinterBlack extends Printer {


	/*
	 * 打印方法:String content 打印内容,String count打印分数,
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
