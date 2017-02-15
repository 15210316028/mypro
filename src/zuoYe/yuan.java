package zuoYe;
public class yuan extends shape
{	
	int r;//半径
	int c;
	int s;	
	public void r()
	{		
		int max=99;
		int min=10;
		r=(int)(Math.random()*(max-min)) +min;
		System.out.print("圆形半径是："+r);
		c();	
		s();
	}
	public boolean s()
	{		
		s=(int) (Math.PI*r*r);
		System.out.println("面积是："+s);
		return true;		
	}	
	public boolean c() 
	{		
		c=(int) (2*r*Math.PI);
		System.out.print("\n周长是："+c+"\t");
		return true;
	}
}
