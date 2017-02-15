package z;


/**
 * 打印机厂
 * @author lenovo
 *
 */
public class PriterFactory {

	/**
	 * 打印机厂生产打印机
	 * @param printerKind
	 * @return
	 */
	public Printer getPrinter(String printerKind)
	{
		if(printerKind.equals("黑白"))		
			return new PrinterBlack();
		else
			return new PrinterColor();		
	}
}
