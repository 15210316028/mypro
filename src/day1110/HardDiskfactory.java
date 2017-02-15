package day1110;
/**
 * 
 * 硬盘生产工厂
 * @author QM
 *
 */
public class HardDiskfactory implements HardDisk {

	@Override
	public String brandHardDisk(int num) 
	{
		String str = "";
		switch(num)
		{
		case 1:
			str = "选择HardDisk型号A";
			break;
		case 2:
			str = "选择HardDisk型号B";
			break;
		}		
		return str;
	}
}
