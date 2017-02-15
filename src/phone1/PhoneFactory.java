package phone1;
public class PhoneFactory
{	
	public phone kind(String color,String kind)throws Exception
	{					
			if(kind.equals("s"))	
				return new SAMSUNG(color,kind);		
			else if(kind.equals("p"))
				return new Apple(color,kind);
			else 
				return new Mi(color,kind);									
	}
}
