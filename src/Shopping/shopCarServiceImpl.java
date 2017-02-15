package Shopping;

import java.util.*;

public class shopCarServiceImpl implements shopCarService {

	public boolean add(shopCar shopCar)  {
		shopCarDao scd=new shopCarDaoImpl();
		boolean find=false;
		try
		{
			if(scd.insert(shopCar))
			{
				System.out.println("��Ʒ����ɹ���");
			}
			else
			{
				System.err.println("��Ʒδ�ܳɹ���ӣ�");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return find;
	}
	public boolean remove(shopCar shopCar)  {
		shopCarDao scd=new shopCarDaoImpl();
		boolean find=false;
		try
		{
			if(scd.delete( shopCar))
			{
				System.out.println("�ɹ�����Ʒ"+shopCar.getSname()+"�ƴ����ﳵ");				
			}
			else
			{
				System.err.println("δ�ܳɹ��Ƴ�����Ʒ");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return find;
	}

	public boolean exit(shopCar shopCar)  {
		shopCarDao scd=new shopCarDaoImpl();
		boolean find=false;
		try
		{
			if(scd.update(shopCar))
			{
				System.out.println("�޸ĳɹ���");
			}
			else
			{
				System.err.println("δ�ܳɹ��޸ģ�");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return find;
	}
	public List<Shop> queryAll()  {
		shopCarDao scd=new shopCarDaoImpl();		
		try {
			return scd.selectAll();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return  queryAll();
	}
	public int queryShop(int sid)  
	{	
		int count=0;
		shopCarDaoImpl scdl=new shopCarDaoImpl();		
		List ls;
		try {
			ls = scdl.selectShop(sid);
			for(Object o:ls)
			{
				Shop s=(Shop)o;				
				count=s.getCount();
			}	
		} catch (Exception e) {			
			e.printStackTrace();
		}
			
		return count;		
	}
	public boolean clear(shopCar shopCar)  {	
		shopCarDao scd=new shopCarDaoImpl();
		boolean find=false;
		try
		{
			if(scd.truncate(shopCar))
			{		
				System.out.println("�ɹ���չ��ﳵ��");					
			}
			else
			{
				System.out.println("������չ��ﳵ��");
			}
		}
		catch(Exception ex)
		{
			ex.getStackTrace();
		}
		return find;
	}
}
