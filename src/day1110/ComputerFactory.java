package day1110;
/**
 * 
 * 电脑组装工厂
 * @author QM
 *
 */
public class ComputerFactory 
{	
	public Computer computer(String style)
	{		
		if(style.equals("1"))	
			return new ComputerPC() ;
		else if(style.equals("2"))
			return new ComputerS() ;
		else if(style.equals("3"))
			return new ComputerY() ;
		else
			return computer(style);
	}
}
