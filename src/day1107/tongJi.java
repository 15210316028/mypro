package day1107;

public class tongJi 
{

	public static void main(String[] args)
	{
		int[] a=new int[10];//存储0-3的10个随机数		
		int[] sum={0,0,0,0};//0-3每个数个数
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*4);
			System.out.print(a[i]+" ");
			sum[a[i]]++;											
		}
		for(int j=0;j<sum.length;j++)
		{
			System.out.println("\n"+j+"有"+sum[j]+"个");
		}
	}

}
