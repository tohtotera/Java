package list.list03_05;

import java.util.HashSet;
import java.util.Set;

public class List03_05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("青");
		
		for (String c : colors){
			System.out.print(c + "->");
		}
	}

}
