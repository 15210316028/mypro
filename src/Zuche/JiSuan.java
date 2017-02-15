package Zuche;
/**
 * 车辆选择及计算
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
