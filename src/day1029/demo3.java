package day1029;

public class demo3
{
	public static void main(String[] zhu)
	{
		int[] s=new int[30];//声明 s 数组长度30 用来放置随机数		
		int[] n=new int[10];//声明 n 数组长度10 用来放置0-9								
		for(int i=0;i<s.length;i++)
		{
			s[i]=(int) (Math.random()*10);//0-9的随机数						
			System.out.print(s[i]+" ");
			n[s[i]]++;
		}
		System.out.println();
		for(int j=0;j<n.length;j++)
		{				
			System.out.println("等于"+j+"的有"+n[j]+"个");
		}							
	}
}
 