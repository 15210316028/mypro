package day1024;
                    /*Ñ­»·*/
public class demo5 {

	public static void main(String[] zhu) 
	{
		String xin="*";
		String kg=" ";
		int b=4;
		for (int i = 1; i < b+1; i++) {
			for (int j = 0; j <b-i; j++) {
				System.out.print(kg);
			}

			for (int j = 1; j <i*2; j++) {
				if(j==i*2-1){
					System.out.println(xin);
				}else{
					System.out.print(xin);
				}
	         }
		}

	}

}
