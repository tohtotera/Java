package list04_06;

import java.util.Iterator;


public class Main extends Account{
    public static void main(String[] args) {
    	Account acnt1 = new Account();
    	Account acnt2 = acnt1.clone();
    	Iterator<Integer> iterator = acnt2.prefs.keySet().iterator();
    	
    	while (iterator.hasNext()){
    		int key = iterator.next();
    		System.out.println(acnt2.prefs.get(key));
    	}
    }
}