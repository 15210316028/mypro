package day1107;

import java.util.Scanner;

public class xiTong 
{
	Scanner I=new Scanner(System.in);
	String name = null,Name;		
	int miMa = 0,MiMa,nmiMa;		
	public void zhuCe()
	{
		/*
		 *ע��
		 *
		 */		
		System.out.println("�����û�����");
		name=I.next();
		System.out.println("�������룺");
		miMa=I.nextInt();
		System.out.println("ע��ɹ���");
		System.out.println("�û����ǣ�"+name+"�����ǣ�"+miMa);
	}
	public boolean dengLu()
	{
		/*
		 * ��½
		 * 
		 */
		System.out.println("�������û�����");
		Name=I.next();
		System.out.println("���������룺");
		MiMa=I.nextInt();		
		if(Name.equals(name))
		{
			if(miMa==MiMa)
			{				
				System.out.println("��½�ɹ���");			
			}
			else if(miMa==nmiMa)
			{				
				System.out.println("��½�ɹ���");
			}			
			else
			{
				System.out.println("�û�����������������µ�¼��");
				return dengLu();
			}
		}
		return false;
	}
	public void xiuGai()
	{
		/*
		 * �޸�����
		 * 
		 */
		dengLu();
		System.out.println("�����������룺");
		nmiMa=I.nextInt();
		System.out.println("�޸ĳɹ����������ǣ�"+nmiMa);					
		miMa=nmiMa;		
		dengLu();
	}				
}			
		

