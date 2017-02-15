package zuoYe;
public class chang extends shape
{		

	int c;
	int s;	
	int[] l=new int[2];
	public void b()
	{
		System.out.print("长方形边长是：");
		for(int i=0;i<l.length;i++)
		{
			int max=99;
			int min=10;
			l[i]=(int)(Math.random()*(max-min)) +min;
			System.out.print(l[i]+" ");
		}
		c();	
		s();
	}
	public boolean s() 
	{
		s=l[0]*l[1];
		System.out.println("面积是："+s);
		return true;
	}	
	public boolean c() 
	{
		c=2*(l[0]+l[1]);	
		System.out.print("\n周长是："+c+"\t");
		return true;
	}
}
