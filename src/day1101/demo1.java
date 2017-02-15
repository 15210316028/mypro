package day1101;

public class demo1 
{
	public static void main(String[] zhu) 
	{
//		student s=new student();
//		s.name="朱俊元";
//		s.banJi="1009JAVA";
//		s.age=25;
//		s.aiHao="象棋";		
//		s.myshow();
		Administrator t=new Administrator();
		Customer f=new Customer();
		t.gh=1001;
		t.mz="老王";
		t.zw="管理员";
		t.gl=20;
		f.mz="小明";
		f.nl=21;
		f.kx="世界银行";
		f.jf=666666;
		
		t.show();
		f.show();
	}
}
