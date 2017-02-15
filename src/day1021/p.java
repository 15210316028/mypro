package day1021;

import java.util.*;

public class p {
	static int arr[] = new int[5];
	public static void main(String a[]) 
	{ 
//		System.out.println(arr[0]);
//		String  s="abcde";
//		StringBuffer  s1=new  StringBuffer("abcde");
//		if(s.equals(s1))
//		      s1=null;
//		if(s1.equals(s))
//		      s=null;
//		 String  s1=new String("abc");
//	        String  s2=new String("abc"); 
//	        boolean b1=s1.equals(s2);
//	        boolean b2=(s1==s2);            
//	        System.out.print(b1+"   "+b2);
		Hashtable hashtable=new Hashtable();
        hashtable.put("x","12345");
        hashtable.put("y","67890");
        hashtable.put("a","abcde"); 
		 System.out.println(hashtable.get("a"));
		
	}

}
