package list.list03_06;

import java.util.Set;
import java.util.TreeSet;

public class List03_06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<String> animals = new TreeSet<String>();
		animals.add("dog");
		animals.add("cat");
		animals.add("wolf");
		animals.add("panda");
		for (String animal : animals){
			System.out.print(animal + "->");
		}
	}

}
