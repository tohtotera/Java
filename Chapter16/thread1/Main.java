package thread1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("何か入力してください。");
		Thread thread = new PrintingThread();
		thread.start();
		new Scanner(System.in).nextLine();
	}
}
