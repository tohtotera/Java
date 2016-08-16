package practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws ParseException{
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Book> list = new ArrayList<Book>();

		list.add(new Book("砂の器", DateFormat.getDateInstance().parse("2011/03/01"),         "感動した作品"));
		list.add(new Book("羅生門", DateFormat.getDateInstance().parse("1986/12/10"),         "難しい作品"));
		list.add(new Book("吾輩は猫である", DateFormat.getDateInstance().parse("1961/03/17"), "すばらしい作品"));

		Collections.sort(list, new BookComparator());

		Iterator<Book> iterator = list.iterator();
		while (iterator.hasNext()){
			Book data = iterator.next();
			System.out.println("書籍名：" + data.getTitle() + "出版日" + data.getPublishDate() + "コメント：" + data.getComment());
		}
	}

/*
		Book book = new Book();
		Date[] d = new Date[3];
		d[0] = DateFormat.getDateInstance().parse("2011/03/01");
		d[1] = DateFormat.getDateInstance().parse("1996/11/06");
		d[2] = DateFormat.getDateInstance().parse("2007/12/21");
		SimpleDateFormat sdf = new SimpleDateFormat("yy/mm/dd");
		Date d1 = DateFormat.getDateInstance().parse(sdf.format("2011/03/17"));
		Date d2 = DateFormat.getDateInstance().parse(sdf.format("2009/07/02"));
		Date d3 = DateFormat.getDateInstance().parse(sdf.format("1987/10/05"));

		//書籍名と発行日を登録
		book.bookManagement.put(d1, "砂の器");
		book.bookManagement.put(d2, "羅生門");
		book.bookManagement.put(d3, "吾輩は猫である");

		//ソート用Listの生成
		List<Map.Entry<Date,String>> list = new ArrayList<Map.Entry<Date, String>>(book.bookManagement.entrySet());

		//sortメソッドのオーバーライド
		Collections.sort(list, new Comparator<Map.Entry<Date, String>>(){

			public int compare(Entry<Date, String>entry1, Entry<Date, String>entry2){
				return (entry1.getValue()).compareTo(entry2.getValue());
			}
		});

		//ソート後の内容を表示
		for (Entry<Date, String> s : list){
			System.out.print("s.getKey() : " + s.getKey());
			System.out.println("s.getValue() : " + s.getValue());
		}

	}
*/
}
