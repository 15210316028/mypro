package day1103;

public class zhuCe2 
{	
	public boolean length(String zh,String sjh,String zjh)
	{		
		if(zh.length()!=16&&zh.length()!=18)
		{
			System.out.println("�����������֤�ű�����16λ��18λ��");
			return false;
		}
		else
		{
			if(sjh.length()!=11)
			{
				System.out.println("���������ֻ��ű�����11λ��");
				return false;
			}
			else
			{				
				String[] fh=zjh.split("-");				
				if(fh[0].length()!=4||fh[1].length()!=7)
				{
					System.out.println("�����������������ű�����4λ��������7λ��");
					return false;
				}
				else
				{
					System.out.println("������ȷ��ע��ɹ���");
						return true;						
				}
			}
		}					
	}
}
