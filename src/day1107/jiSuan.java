package day1107;

public class jiSuan 
{
	int[] a=new int[10];//�洢0-3��10�������
	int[] sum=new int[4];	
	public void jisuan()
	{		
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*4);
			System.out.print(a[i]+" ");
			sum[a[i]]++;												
		}
	}
	public void jiLu()
	{
		for(int j=0;j<sum.length;j++)
		{
			System.out.println("\n"+j+"��"+sum[j]+"��");
		}
	}		

}
