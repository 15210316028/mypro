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
		System.out.println("��ӭ���������̳ǣ�");
		while(true)
		{
			System.out.println("��ѡ��ҵ��1������ 2���޸� 3�����㣩");
			int num=I.nextInt();
			if(num==1)
			{
				System.out.println("��ӭ���");
				System.out.println("���̳ǲ�Ʒ���£�");	
				System.out.println("��Ʒ���\t��Ʒ����\t��Ʒ����");
				List<Shop> ls=scs.queryAll();
				for(int i=0;i<ls.size();i++)
				{
					Shop shop=(Shop)ls.get(i);				
					System.out.println(shop.getId()+"\t"+shop.getName()+"\t"+shop.getPrice());
				}
				System.out.println("ѡ��Ҫ����Ĳ�Ʒ�ţ�");
				int sid=I.nextInt();						
				System.out.println("������Ҫ�����������");
				int scount=I.nextInt();																	
				if(scount>scsi.queryShop(sid))
				{
					System.err.println("�������������������Ʒ�Ŀ�棬���������룡");
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
				System.out.println("��ѡ��ҵ��1���޸����� 2��ȫ����գ�");
				num=I.nextInt();
				if(num==1)
				{
					System.out.println("����Ҫ�޸ĵ���Ʒ���:");
					int sid=I.nextInt();
					System.out.println("�������¹�������:");
					int scount = I.nextInt();														
					if(scount>scsi.queryShop(sid))
					{
						System.err.println("�������������������Ʒ�Ŀ�棬���������룡");
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
					System.err.println("ѡ������������ѡ��");
					continue;
				}
			}
			else if(num==3)
			{			
				System.out.println("�������Ʒ���£�");
				
				
				
				System.out.println("ллʹ��!");				
				break;
			}
			else
			{
				System.err.println("ѡ������������ѡ��");
			}
		}
		
	}

}
