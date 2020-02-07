package ch13;

public class ThreadEx5 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx5_1 t1 = new ThreadEx5_1();
		t1.start();
		startTime = System.currentTimeMillis();
		
		for(int i=0; i < 300; i++) {
			System.out.print("-");
		}
		
		System.out.print("\n소요시간1:" + (System.currentTimeMillis() - startTime));
	}
}

class ThreadEx5_1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
		}
		
		System.out.print("\n소요시간2:" + (System.currentTimeMillis() - ThreadEx5.startTime));
	}
}