package day1110;
/**
 * 
 * �ڴ���������
 * @author QM
 *
 */
public class EMSfactory implements EMS {
	@Override
	public String brandEMS(int num) 
	{
		String str = "";
		switch(num)
		{
		case 1:
			str = "ѡ��EMS�ͺ�A";
			break;
		case 2:
			str = "ѡ��EMS�ͺ�B";
			break;
		}	
		return str;
	}
}
