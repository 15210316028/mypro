package day1203;

import java.util.*;
import java.util.Map.Entry;

public class win {

	public static void main(String[] args) 
	{
		Scanner I=new Scanner(System.in);
		Set<Integer> s=new HashSet<Integer>();
		int random = 0;
		int num ;
		int sum = 0;
		for(int i=0;i<7;i++)
		{
			do
			{
				random=(int) (Math.random()*30+1);
			}
			while(s.contains(random));
			s.add(random);
		}		
		for(int i=0;i<7;i++)
		{
			System.out.print("������ĵ�"+(i+1)+"�����֣����ظ�����");
			num=I.nextInt();
			if(s.contains(num))
			{
				sum++;
			}
		}
		Iterator<Integer> it=s.iterator();
		System.out.println("�н����룺");
		while(it.hasNext())
		{			
			System.out.print(it.next()+" ");			
		}
		System.out.println("\n���е����ĸ�����"+sum);
		if(sum==7)
		{
			System.out.println("��ϲ������һ�Ƚ���");			
		}
		else if(sum==6)
		{
			System.out.println("��ϲ�����˶��Ƚ���");
		}
		else if(sum==5)
		{
			System.out.println("��ϲ���������Ƚ���");
		}
		else
		{
			System.out.println("�Բ�����û�н���");
		}
	}

}
