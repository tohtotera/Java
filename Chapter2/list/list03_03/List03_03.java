package list.list03_03;

import java.util.ArrayList;
import java.util.Iterator;

public class List03_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> names = new ArrayList<String>();
		names.add("tera");
		names.add("weider");
		names.add("aho");
		//Iteratorの生成
		Iterator<String> iterator = names.iterator();
		
		while (iterator.hasNext()){
			String e = iterator.next();
			System.out.println(e);
		}
	}

}
