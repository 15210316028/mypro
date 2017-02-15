package p;

import java.util.*;

public class job {
	 private int id;
	 private int count;
	 private double money;
	 
	 
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	public static void main(String[] args) {
		Scanner I=new Scanner(System.in);
		job j;
		double sum = 0,avg = 0 ;
		Set<job> s=new HashSet<job>();
		while(true)
		{
			j=new job();
			System.out.println("输入工号");
			j.setId(I.nextInt());
			System.out.println("输入工资");
			j.setMoney(I.nextDouble());
			s.add(j);
			System.out.println("是否继续（y/n）");
			String yes=I.next();
			
			if(yes.equals("y"))
			{				
				continue;
			}
			else
			break;
		}
		Iterator<job> it=s.iterator();
		{
			while(it.hasNext())
			{
				j=(job)it.next();					
				sum=sum+j.getMoney();
				avg=sum/s.size();
				System.out.println(j.getId()+" "+j.getMoney()+" "+sum+" "+avg);
			}
		}
	}

}
