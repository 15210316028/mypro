package p;

import java.util.*;

public class remove {
	private String a;
	private String b;
	private String c;
	
	
	public String getA() {
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}


	public String getB() {
		return b;
	}


	public void setB(String b) {
		this.b = b;
	}


	public String getC() {
		return c;
	}


	public void setC(String c) {
		this.c = c;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		remove other = (remove) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		return true;
	}


	public static void main(String[] args) 
	{
		remove r=new remove();
		r.setA("a");
		r.setA("b");
		r.setB("a");
		r.setC("a");		
		List<remove> l=new ArrayList<remove>();
		l.add(r);
		List<remove> ls=new ArrayList<remove>();
		Iterator<remove> it=l.iterator();
		if(it.hasNext())
		{
			r=(remove)it.next();
			if(!ls.contains(r))
			{
				ls.add(r);
			}
		}						
		for(int i=0;i<ls.size();i++)			
		{
			r=(remove)ls.get(i);
			System.out.println(r.getA()+" "+r.getB()+" "+r.getC());
		}
	}

}
