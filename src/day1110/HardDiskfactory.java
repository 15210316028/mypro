package day1110;
/**
 * 
 * Ӳ����������
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
			str = "ѡ��HardDisk�ͺ�A";
			break;
		case 2:
			str = "ѡ��HardDisk�ͺ�B";
			break;
		}		
		return str;
	}
}
