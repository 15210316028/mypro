package zuoYe;
public class yuan extends shape
{	
	int r;//�뾶
	int c;
	int s;	
	public void r()
	{		
		int max=99;
		int min=10;
		r=(int)(Math.random()*(max-min)) +min;
		System.out.print("Բ�ΰ뾶�ǣ�"+r);
		c();	
		s();
	}
	public boolean s()
	{		
		s=(int) (Math.PI*r*r);
		System.out.println("����ǣ�"+s);
		return true;		
	}	
	public boolean c() 
	{		
		c=(int) (2*r*Math.PI);
		System.out.print("\n�ܳ��ǣ�"+c+"\t");
		return true;
	}
}
