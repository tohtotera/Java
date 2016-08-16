package list04_06;

import java.util.TreeMap;



public class Account implements Comparable<Account>, Cloneable {
	private int number;
    TreeMap<Integer, Account> prefs = new TreeMap<Integer, Account>();
 

	public Account clone(){
		Account acnt = new Account();
		//Map<Integer, Account> prefs = new HashMap<Integer, Account>();
		prefs.put(0, acnt.setNumber(60));
		prefs.put(1, acnt.setNumber(10));
		prefs.put(2, acnt.setNumber(50));
		return acnt;
	}

	public int getNumber(){
		return this.number;
	}

	public Account setNumber(int n){
		this.number = n;
		return this;
	}
	public int compareTo(Account obj){
		if (this.number < obj.number) return -1;
		if (this.number > obj.number) return 1;
		return 0;
	}
}
