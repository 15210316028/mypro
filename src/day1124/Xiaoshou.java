package day1124;

public class Xiaoshou implements Runnable{

	int i=50;
	public synchronized void mai() {
		String name=Thread.currentThread().getName();
		if(i>0){
			System.out.println("��"+(51-(i--))+"��Ʊ��"+name+"����ȥ��");
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
		Thread t=new Thread(mr,"��ƱԱA");
		t.start();
		Thread t1=new Thread(mr,"��ƱԱB");
		t1.start();
		Thread t2=new Thread(mr,"��ƱԱC");
		t2.start();
		Thread t3=new Thread(mr,"��ƱԱD");
		t3.start();
	}
}


