package day1110;
/**
 * 
 * CPU生产工厂
 * @author QM
 *
 */
public class CPUfactory implements CPU {	
	public String brandCPU(int num) 
	{
		String str = "";
		switch(num)
		{
		case 1:
			str =  "选择CPU型号A";
			break;
		case 2:
			str = "选择CPU型号B";
			break;
		}	
		return str;
	}
}
