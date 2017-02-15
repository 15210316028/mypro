package day1124;

public class EagerSingleton 
{
	private EagerSingleton ()
	{
		
	}
	
	private static EagerSingleton es=new EagerSingleton();
	
	public static EagerSingleton getInstance()
	{
		return es;
	}
}
