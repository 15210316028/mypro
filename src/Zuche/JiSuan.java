package Zuche;
/**
 * ����ѡ�񼰼���
 * @author QM
 *
 */
public class JiSuan 
{		
	public MotoVehicleFactory kind(String kind)
	{		
		if(kind.equals("car"))
		{						
			return new Car();						
		}
		else 
		{
			return new Bus();			
		}				
	}
}
