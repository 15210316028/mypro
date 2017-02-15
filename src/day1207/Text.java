package day1207;

public class Text {

	static boolean find(char c)
	{
		System.out.print(c);
		return true;
	}
	public static void main(String[] args) 
	{
		int i=0;
		find('A');
		for(;(i<2)&&find('B');)
		{			
									
			find('D');
			i++;
			find('C');
		}

	}

}
