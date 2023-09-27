
import java.util.ArrayList;
import java.util.List;

class ThreadSimpleTest {
	public static void main (String[] args) throws InterruptedException {
		
		ThreadSimple t1 = new ThreadSimple("Argentina");
		ThreadSimple t2 = new ThreadSimple("Uruguay");
		//Thread t3 = new Thread(new RunnableSimple("Brasil"));
		
		List<Thread> hilos = new ArrayList<Thread>();
		
		for (int i = 0; i < 10; i++) {
			hilos.add(new ThreadSimple("Pais "+i));
		}

		for(Thread t : hilos) {
			t.start();
		}

		for(Thread t : hilos) {
			t.join();
		}
		
		t1.start();
		t2.start();
		//t3.start();
		
		t1.join();
		t2.join();
		//t3.join();
		
		
		
		System.out.println("FINALIZO EL PROGRAMA");
	}
}
