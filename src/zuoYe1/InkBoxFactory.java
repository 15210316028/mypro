package zuoYe1;

import java.util.Scanner;
/**
 * 
 * ī�г���ī��
 * @author QM
 *
 */
public class InkBoxFactory implements InkBox {
/**
 * 
 * ī������ѡ��   kind
 */
	Scanner I=new Scanner(System.in);
	String kind;
	public void kind() 
	{
		System.out.print("ѡ��ī�У�1���ڰ�   2����ɫ����");
		int num=I.nextInt();
		switch(num)
		{
		case 1:
			kind="�ڰ�";
			break;
		case 2:
			kind="��ɫ";
			break;
		default:
			System.out.print("ѡ������������ѡ��");
		}		
	}	
}
