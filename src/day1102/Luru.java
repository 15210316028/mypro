package day1102;
public class Luru {	
	String[] sz;

	int i=0;
	public void a(int size) 
	{
		sz=new String[size];		
	}
	public void b(String name)//Ãû×Ö
	{		
		sz[i]=name;		
		i++;
	}
	public void c()
	{
		for(int j=0;j<sz.length;j++)
		{
			System.out.print(sz[j]+" ");			
		}
	}
	public boolean d(String oldname,String newname) 
	{
		boolean find = false;  		
		for(int i=0;i<sz.length;i++) 
		{			
		      if(sz[i].equals(oldname)) 
		      {	
			  find=true;
			  sz[i]=newname;
			  break;
		      }
		}
		return find;
	}
	public double avg(int[] fen)
	{
		int sum=0;
		double avg=0.0;
		for(int i=0;i<fen.length;i++)
		{
			sum=sum+fen[i];
		}
		avg=sum/fen.length;
		return avg;
	}

}
