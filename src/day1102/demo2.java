package day1102;

import java.util.Arrays;
import java.util.Scanner;

public class demo2 
{

	public static void main(String[] args)
	{
		int[] s=new int[5];
		int sum=0;
		double avg=0;
		Scanner I=new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
			System.out.print("�����"+(i+1)+"�ɼ�:");
			int fen=I.nextInt();
			s[i]=fen;
			sum=sum+s[i];
		}
		Arrays.sort(s);
		avg=sum/s.length;
		System.out.println("��߷֣�"+s[s.length-1]+"\n�ܷ֣�"+sum+"\nƽ���֣�"+avg);
	}

}
