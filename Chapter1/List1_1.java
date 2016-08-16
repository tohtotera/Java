
public class List1_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = "スッキリ";
		String s2 = "Java";
		String s3 = "java";
		
		if (s2.equals(s3)){
			System.out.println("s2とs3は等しい。");
		}
		if (s2.equalsIgnoreCase(s3)){
			System.out.println("s2とs3はケースを区別しなければ等しい。");
		}
		//s1の長さを表示
		System.out.println("文字列s1の長さは" + s1.length() + "です。");
		//s1が空文字かどうかを調べる
		if (s1.isEmpty()){
			System.out.println("文字列s1は空文字です。");
		}
	}

}
