package z;


/**
 * ��ӡ����
 * @author lenovo
 *
 */
public class PriterFactory {

	/**
	 * ��ӡ����������ӡ��
	 * @param printerKind
	 * @return
	 */
	public Printer getPrinter(String printerKind)
	{
		if(printerKind.equals("�ڰ�"))		
			return new PrinterBlack();
		else
			return new PrinterColor();		
	}
}
