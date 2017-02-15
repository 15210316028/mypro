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
			System.out.print("输入你的第"+(i+1)+"个数字（不重复）：");
			num=I.nextInt();
			if(s.contains(num))
			{
				sum++;
			}
		}
		Iterator<Integer> it=s.iterator();
		System.out.println("中奖号码：");
		while(it.hasNext())
		{			
			System.out.print(it.next()+" ");			
		}
		System.out.println("\n猜中得数的个数："+sum);
		if(sum==7)
		{
			System.out.println("恭喜你中了一等奖！");			
		}
		else if(sum==6)
		{
			System.out.println("恭喜你中了二等奖！");
		}
		else if(sum==5)
		{
			System.out.println("恭喜你中了三等奖！");
		}
		else
		{
			System.out.println("对不起，您没中奖！");
		}
	}

}
