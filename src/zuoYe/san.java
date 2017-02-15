package zuoYe;
public class san extends shape 
{
	int c;
	int s;
	int[] l=new int[3];
	public boolean b() 
	{
		System.out.print("三角形边长是：");
		for(int i=0;i<l.length;i++)
		{
			int max=99;
			int min=10;
			l[i]=(int)(Math.random()*(max-min)) +min;
			System.out.print(l[i]+" ");
		}								
		if(((l[0]+l[1])>l[2])&&((l[0]+l[2])>l[1])&&((l[2]+l[1])>l[0]))
		{
			c();	
			s();
		}
		else
		{
			System.out.println("输入有误，重新输入：");
			return b();
		}
		return false;		
	}	
	public boolean c() 
	{
		c=l[0]+l[1]+l[2];
		System.out.print("\n周长是："+c+"\t");
		return true;
	}	
	public boolean s() 
	{		
		int m=(int) (c/2);
		s = (int) Math.sqrt(m*(m-l[0])*(m-l[1])*(m-l[2]));
		System.out.println("面积是："+s);
		return true;
	}
}
