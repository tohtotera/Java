package practice9;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("1円以上のアイテム一覧表を表示します。");
		ArrayList<Item> items = ItemDAO.findByMinimumPrice(1);
		for (Item i : items){
			System.out.printf("%10s%4d%4d", i.getName(), i.getPrice(), i.getWeight());
		}
	}

}
