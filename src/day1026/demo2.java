package day1026;

import java.util.Scanner;

public class demo2 
{

	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);
		int hyh=0000,hysr=0000,hyjf=0000;
		for(int i=1;i<=3;i++)
		{
			System.out.println("\n�����Ա��(��λ����):");		
			hyh=I.nextInt();
			System.out.println("�����Ա����:");		
			hysr=I.nextInt();
			System.out.println("�����Ա����:");		
			hyjf=I.nextInt();			
			if(hyh<1000||hyh>=10000)
			{
				break;
			}											
				System.out.println("¼����Ϣ��"+"\n"+hyh+"\t"+hysr+"\t"+hyjf);
		}
			System.out.println("����ʧ��!");				
	}

}
