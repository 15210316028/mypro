package day1108;

public class PaperFactory implements Paper {

	@Override
	public void zzbz(String kind) {
		if(kind.equals("A4"))
		{
			System.out.println("A4ֽ�Ѿ����");
		}
		if(kind.equals("B5"))
		{
			System.out.println("B5ֽ�Ѿ����");
		}
	}

}
