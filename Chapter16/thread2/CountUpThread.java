package thread2;

public class CountUpThread extends Thread{
	public void run(){
		for (int i = 0; i < 50; i++){
			System.out.print(i);
		}
		System.out.println();
	}
}
