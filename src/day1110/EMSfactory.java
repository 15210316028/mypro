package day1110;
/**
 * 
 * 内存生产工厂
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
			str = "选择EMS型号A";
			break;
		case 2:
			str = "选择EMS型号B";
			break;
		}	
		return str;
	}
}
