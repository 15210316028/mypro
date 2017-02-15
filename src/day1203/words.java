package day1203;

import java.util.*;

public class words {

	public static void main(String[] zhu) 
	{		 	        
        int count = 0;  
        //第一种
        for (int i = 0; i < 100; i++) 
        {                      
             char ch = (char) (Math.random() * 26 + 65);
             System.out.print(ch+" ");
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
            {
                count++;                
            }
        }        
        System.out.println("\n元音字母的个数：" + count); 
        //第二种
        Map<Character, Integer> c=new HashMap<Character, Integer>();//创建集合保存字母出现次数计数，把字母当作键，次数当值最合适。
        for(int i=0;i<100;i++)
        {
        	 char ch = (char) (Math.random() * 26 + 65);              
         System.out.print(ch+""+" ");
         if(c.get(ch)!=null)//判断集合中是否有这个字母
         {
         c.replace(ch, c.get(ch), Integer.parseInt(c.get(ch)+"")+1);//出现过这个字母则将这个值对应+1并替换之前的
         }else{
         c.put(ch,1 );//没出现过的字母，存入集合，次数默认为1
         }
         if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
         {       	 
			count++;
         }
        }
     System.out.println("\n元音字母的个数:"+count);     
	}
}
