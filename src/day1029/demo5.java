package day1029;

public class demo5 
{
	public static void main(String[] zhu) 
	{
		int[] sz=new int[10];;//��������
		int os = 0,js=0;//����ż������������
		for(int i=0;i<sz.length;i++)
		{
			sz[i]=(int) (Math.random()*100);
			System.out.print(sz[i]+",");	
			if(sz[i]%2==0)
			{
				os++;
			}
			else
			{
				js++;
			}
		}
		System.out.print("\nż������:"+os+"\n��������:"+js);
	}
}
