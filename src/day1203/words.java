package day1203;

import java.util.*;

public class words {

	public static void main(String[] zhu) 
	{		 	        
        int count = 0;  
        //��һ��
        for (int i = 0; i < 100; i++) 
        {                      
             char ch = (char) (Math.random() * 26 + 65);
             System.out.print(ch+" ");
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
            {
                count++;                
            }
        }        
        System.out.println("\nԪ����ĸ�ĸ�����" + count); 
        //�ڶ���
        Map<Character, Integer> c=new HashMap<Character, Integer>();//�������ϱ�����ĸ���ִ�������������ĸ��������������ֵ����ʡ�
        for(int i=0;i<100;i++)
        {
        	 char ch = (char) (Math.random() * 26 + 65);              
         System.out.print(ch+""+" ");
         if(c.get(ch)!=null)//�жϼ������Ƿ��������ĸ
         {
         c.replace(ch, c.get(ch), Integer.parseInt(c.get(ch)+"")+1);//���ֹ������ĸ�����ֵ��Ӧ+1���滻֮ǰ��
         }else{
         c.put(ch,1 );//û���ֹ�����ĸ�����뼯�ϣ�����Ĭ��Ϊ1
         }
         if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
         {       	 
			count++;
         }
        }
     System.out.println("\nԪ����ĸ�ĸ���:"+count);     
	}
}
