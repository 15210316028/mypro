package day1029;

public class demo6 
{
	public static void main(String[] zhu)
	{
		int[] Old=new int[20];//����һ��������
		int sum=0;//ͳ��0�ĸ���		
		int[] New=new int[20];//����һ��������
		int i,j=0;
		int L=New.length;
		System.out.print("�任ǰ���飺");
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
		System.out.print("\n�任�����飺");		
		L=Old.length-sum;
		for(j=0;j<L;j++)
		{
			System.out.print(New[j]+",");
		}
	}
}
