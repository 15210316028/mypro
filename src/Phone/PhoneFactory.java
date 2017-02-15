package Phone;

import java.util.Scanner;

public class PhoneFactory
{
	Scanner I=new Scanner(System.in);
	public Phone kind(int b)
	{		
		switch(b)
		{
		case 1:
			return new SAMSUNG();	
		case 2:
			return new Apple();
		case 3:
			return new Mi();
		default:
			return  kind(b);	
		}	
//			if(b.equals("s"))	
//				return new SAMSUNG();		
//			else if(b.equals("p"))
//				return new Apple();
//			else if(b.equals("m"))
//				return new Mi();
//			else
//				return  kind(b);	
	}
}
