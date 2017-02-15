package day1124;
public class MyThread extends Thread {
	static String name;
	public void run() {
		for (int i = 0; i < 10; i++) {
			name = Thread.currentThread().getName();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "���е�" + (i + 1) + "��");
		}
	}

	public static void main(String[] zhu) {
		Thread t = new Thread();
		t.start();
		MyThread mt = new MyThread();
		for (int i = 0; i < 10; i++) {
			System.out.println(t.getName()+ "���е�" + (i + 1) + "��");
			
			mt.run();
		}
	}
}
