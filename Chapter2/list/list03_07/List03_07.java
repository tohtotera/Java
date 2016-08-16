package list.list03_07;

import java.util.HashMap;
import java.util.Map;

public class List03_07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		int tokyou = prefs.get("東京都");
		System.out.println("東京都の人口は" + tokyou);
		prefs.remove("京都府");
		prefs.put("熊本県", 182);
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は" + kumamoto);
		
		for (String key : prefs.keySet()){
			int value = prefs.get(key);
			System.out.println(key + "の人口は" + value );
		}
	}

}
