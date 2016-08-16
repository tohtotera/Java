import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		try{
			ArrayList<Character>array = new ArrayList<Character>();
			array.add('a');
			array.add('b');
			array.add('c');

			//for文を使ったリスト変数の中身の出力
			for (int i = 0; i < array.size() ; i++){
				System.out.println(array.get(i));
			}
			System.out.println("-----------------------------------");
			//拡張for文を使ったリスト変数の中身の出力
			int i = 0;
			for (char ch : array){
				System.out.println((i++) + "番目の文字は" + ch + "です。");
			}
			System.out.println("------------------------------------");

			//Iteratorを使ったリスト変数の中身の出力(while文)
			Iterator<Character> iterator = array.iterator();

			int num = 0;
			while (iterator.hasNext()){
				System.out.println((num++) + "番目の文字は" + iterator.next() + "です。");
			}
			System.out.println("------------------------------------");

			//Iteratorを使ったリスト変数の中身の出力(拡張for文）
			int n = 0;
			for (Character it : array){
				System.out.println((n++) + "番目の文字は" + it + "です。");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
