package day1103;

public class zhuCe2 
{	
	public boolean length(String zh,String sjh,String zjh)
	{		
		if(zh.length()!=16&&zh.length()!=18)
		{
			System.out.println("输入有误，身份证号必须是16位或18位！");
			return false;
		}
		else
		{
			if(sjh.length()!=11)
			{
				System.out.println("输入有误，手机号必须是11位！");
				return false;
			}
			else
			{				
				String[] fh=zjh.split("-");				
				if(fh[0].length()!=4||fh[1].length()!=7)
				{
					System.out.println("输入有误，座机号区号必须是4位，机号是7位！");
					return false;
				}
				else
				{
					System.out.println("输入正确，注册成功！");
						return true;						
				}
			}
		}					
	}
}
