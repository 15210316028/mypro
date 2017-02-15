package Shopping;

import java.util.*;


public class Test {

	public static void main(String[] zhu) throws Exception 
	{
		Scanner I=new Scanner(System.in);
		shopCarService scs=new shopCarServiceImpl();
		shopCarServiceImpl scsi=new shopCarServiceImpl();
		shopCar sc=new shopCar();
		Shop s=new Shop();
		System.out.println("欢迎来到购物商城！");
		while(true)
		{
			System.out.println("请选择业务（1、购物 2、修改 3、结算）");
			int num=I.nextInt();
			if(num==1)
			{
				System.out.println("欢迎购物！");
				System.out.println("本商城产品如下：");	
				System.out.println("商品编号\t商品名称\t商品单价");
				List<Shop> ls=scs.queryAll();
				for(int i=0;i<ls.size();i++)
				{
					Shop shop=(Shop)ls.get(i);				
					System.out.println(shop.getId()+"\t"+shop.getName()+"\t"+shop.getPrice());
				}
				System.out.println("选择要购买的产品号：");
				int sid=I.nextInt();						
				System.out.println("请输入要购买的数量：");
				int scount=I.nextInt();																	
				if(scount>scsi.queryShop(sid))
				{
					System.err.println("您输入的数量超出该商品的库存，请重新输入！");
				}
				else
				{
					sc.setSid(sid);					
					sc.setScount(scount);
					sc.setMoney(s.getPrice()*scount);
					scs.add(sc);
				}										
			}
			else if(num==2)
			{
				System.out.println("请选择业务（1、修改数量 2、全部清空）");
				num=I.nextInt();
				if(num==1)
				{
					System.out.println("输入要修改的商品编号:");
					int sid=I.nextInt();
					System.out.println("输入重新购买数量:");
					int scount = I.nextInt();														
					if(scount>scsi.queryShop(sid))
					{
						System.err.println("您输入的数量超出该商品的库存，请重新输入！");
					}
					else
					{
						scs.exit(sc);
					}
					
				}
				else if(num==2)
				{
					scs.clear(sc);
				}
				else
				{
					System.err.println("选择有误，请重新选择！");
					continue;
				}
			}
			else if(num==3)
			{			
				System.out.println("您购物产品如下：");
				
				
				
				System.out.println("谢谢使用!");				
				break;
			}
			else
			{
				System.err.println("选择有误，请重新选择！");
			}
		}
		
	}

}
