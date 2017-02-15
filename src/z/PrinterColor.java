package z;

public class PrinterColor extends Printer{
	
	/*
	 * 打印方法String context 打印内容,String count打印分数,String wc打印是否彩印,String kind 打印纸大小
	 */
	public void print()
	{
		super.getInkBox().color("彩色");
		super.getPaper().kind(super.getColor());
		for(int i=0;i<super.getCount();i++)
		{
			System.out.println(super.getContent());
		}
	}

}
