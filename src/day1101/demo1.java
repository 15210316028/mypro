package day1101;

public class demo1 
{
	public static void main(String[] zhu) 
	{
//		student s=new student();
//		s.name="�쿡Ԫ";
//		s.banJi="1009JAVA";
//		s.age=25;
//		s.aiHao="����";		
//		s.myshow();
		Administrator t=new Administrator();
		Customer f=new Customer();
		t.gh=1001;
		t.mz="����";
		t.zw="����Ա";
		t.gl=20;
		f.mz="С��";
		f.nl=21;
		f.kx="��������";
		f.jf=666666;
		
		t.show();
		f.show();
	}
}
