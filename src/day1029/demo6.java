package day1029;

public class demo6 
{
	public static void main(String[] zhu)
	{
		int[] Old=new int[20];//定义一个旧数组
		int sum=0;//统计0的个数		
		int[] New=new int[20];//定义一个新数组
		int i,j=0;
		int L=New.length;
		System.out.print("变换前数组：");
		for(i=0;i<Old.length;i++)
		{			
			Old[i]=(int) (Math.random()*10);
			System.out.print(Old[i]+",");
			if(Old[i]==0)
			{						
				sum++;
				continue;
			}
			else
			{
			New[j]=Old[i];
			j++;
			}						
		}
		System.out.print("\n变换后数组：");		
		L=Old.length-sum;
		for(j=0;j<L;j++)
		{
			System.out.print(New[j]+",");
		}
	}
}
