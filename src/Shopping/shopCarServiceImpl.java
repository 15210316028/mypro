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
				System.out.println("商品加入成功！");
			}
			else
			{
				System.err.println("商品未能成功添加！");
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
				System.out.println("成功将产品"+shopCar.getSname()+"移处购物车");				
			}
			else
			{
				System.err.println("未能成功移除该商品");
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
				System.out.println("修改成功！");
			}
			else
			{
				System.err.println("未能成功修改！");
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
				System.out.println("成功清空购物车！");					
			}
			else
			{
				System.out.println("不能清空购物车！");
			}
		}
		catch(Exception ex)
		{
			ex.getStackTrace();
		}
		return find;
	}
}
