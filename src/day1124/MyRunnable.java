package day1124;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		Thread t = new Thread();
		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(t.getName() + "���е�" + (i + 1) + "��");
		}
	}

	// public static void main(String[] zhu)
	// {
	// String name=Thread.currentThread().getName();
	// MyRunnable mr=new MyRunnable();
	// Thread t=new Thread(mr);
	// t.start();
	// for(int i=0;i<10;i++)
	// {
	// mr.run();
	// System.out.println(name+"���е�"+(i+1)+"��");
	//
	// }
	// }
	public static void main(String[] zhu) {
		Thread t = new Thread(new Runnable() {
			String name = Thread.currentThread().getName();
			public void run() {
				for (int i = 0; i < 10; i++) {

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(name + "���е�" + (i + 1) + "��");
				}
			}
		});
		for(int i=0;i<10;i++)
		{
			System.out.println(t.getName() + "���е�" + (i + 1) + "��");
		t.start();
		}
	}
}
