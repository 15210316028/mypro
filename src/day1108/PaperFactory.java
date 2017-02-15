package day1108;

public class PaperFactory implements Paper {

	@Override
	public void zzbz(String kind) {
		if(kind.equals("A4"))
		{
			System.out.println("A4纸已经造出");
		}
		if(kind.equals("B5"))
		{
			System.out.println("B5纸已经造出");
		}
	}

}
