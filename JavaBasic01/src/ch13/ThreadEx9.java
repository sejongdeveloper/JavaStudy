package ch13;

public class ThreadEx9 {
	public static void main(String[] args) {
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		
		
		// ThreadGroup(ThreadGroup parent, String name)
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "subGroup1");
		
		grp1.setMaxPriority(3); // 쓰레드 그룹 grp1의 최대우선순위를 3으로 변경.
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000); // 쓰레드를 1초간 멈추게 한다.
				} catch (InterruptedException e) {}
				
			}
		};
		
		// Thread(ThreadGroup tg, Runnable r, String name)
		Thread th1 = new Thread(grp1, 	 r, "th1");
		Thread th2 = new Thread(subGrp1, r, "th2");
		Thread th3 = new Thread(grp2, 	 r, "th3");
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println(">>List of ThradGroup : " + main.getName()
					+ ", Active ThreadGroup: " 		 + main.activeGroupCount()
					+ ", Actuve Thread: " 			 + main.activeCount());
		
		
	}
}
