package day1110;
/**
 * 
 * CPU��������
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
			str =  "ѡ��CPU�ͺ�A";
			break;
		case 2:
			str = "ѡ��CPU�ͺ�B";
			break;
		}	
		return str;
	}
}
