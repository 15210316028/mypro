package day1107;

public class tongJi 
{

	public static void main(String[] args)
	{
		int[] a=new int[10];//�洢0-3��10�������		
		int[] sum={0,0,0,0};//0-3ÿ��������
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*4);
			System.out.print(a[i]+" ");
			sum[a[i]]++;											
		}
		for(int j=0;j<sum.length;j++)
		{
			System.out.println("\n"+j+"��"+sum[j]+"��");
		}
	}

}
