package day1108;

public class zhuren 
{
	public void feed(pet1 pet)
	{
		pet.eat();
		pet.drink();
		pet.poo();
		pet.sleep();		
		pet.chonglang();
		pet.pashu();
	}
	public void play(pet1 pet)
	{
		if(pet instanceof pen1)
		{
			pen1 b=(pen1) pet;
			b.swimming();
		}
		else
		{
			dog1 a=(dog1) pet;
			a.swimming();
		}
			
	}
	public static void main(String[] zhu)
	{
		zhuren m=new zhuren();
		pet1 p=new dog1();		
		m.play(p);
		pet1 p1=new pen1();
		m.play(p1);
	}
}
