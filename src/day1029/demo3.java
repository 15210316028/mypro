package day1029;

public class demo3
{
	public static void main(String[] zhu)
	{
		int[] s=new int[30];//���� s ���鳤��30 �������������		
		int[] n=new int[10];//���� n ���鳤��10 ��������0-9								
		for(int i=0;i<s.length;i++)
		{
			s[i]=(int) (Math.random()*10);//0-9�������						
			System.out.print(s[i]+" ");
			n[s[i]]++;
		}
		System.out.println();
		for(int j=0;j<n.length;j++)
		{				
			System.out.println("����"+j+"����"+n[j]+"��");
		}							
	}
}
 