package list.list03_04;

import java.util.HashSet;
import java.util.Set;

public class List03_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<String> colors = new HashSet<String>();
		colors.add("青");
		colors.add("赤");
		colors.add("黄");
		colors.add("赤");
		System.out.println("色の種類は" + colors.size() + "色です。");
	}

}
