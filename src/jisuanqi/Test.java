package jisuanqi;

import org.apache.log4j.Logger;

public class Test {
	public static void main(String jiang[])
	{	Logger log=Logger.getLogger(jisuan.class);
		jisuan js=new jisuan();
		try {
			js.suanfa();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
