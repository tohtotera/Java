package list.list03_09;

import java.util.ArrayList;
import java.util.List;

class Weider {
	public String name;
}

public class List03_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Weider> hero = new ArrayList<Weider>();
		Weider h = new Weider();
		h.name = "weider";
		hero.add(h);
		h.name = "うひひ";
		System.out.println("ヒーローの名前は" + hero.get(0).name);
	}

}
