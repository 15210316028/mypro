package day1124;

public class Xiaoshou implements Runnable{

	int i=50;
	public synchronized void mai() {
		String name=Thread.currentThread().getName();
		if(i>0){
			System.out.println("第"+(51-(i--))+"张票由"+name+"卖出去的");
			try{
				Thread.sleep(50);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}	
	}
	public void run()
	{	
		while(i>0){
			mai();
		}
	}
	public static void  main(String []shou){
		Xiaoshou mr=new Xiaoshou();
		Thread t=new Thread(mr,"售票员A");
		t.start();
		Thread t1=new Thread(mr,"售票员B");
		t1.start();
		Thread t2=new Thread(mr,"售票员C");
		t2.start();
		Thread t3=new Thread(mr,"售票员D");
		t3.start();
	}
}


