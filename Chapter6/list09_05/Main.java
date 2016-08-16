package list09_05;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
	// throwsで例外処理を省略しています
	// 実際の開発では正しく例外処理を行ってください
	public static void main(String[] args) throws IOException {
        String msg = "第1土曜";
        int year, month, day;
        Calendar calendar = Calendar.getInstance();
        //年月日の入力
        System.out.println("年を入力してください。");
        year = new java.util.Scanner(System.in).nextInt();
        System.out.println("月を入力してください。");
        month = new java.util.Scanner(System.in).nextInt();
        System.out.println("日にちを入力してください。");
        day = new java.util.Scanner(System.in).nextInt();
        //日付をCalendarクラスのインスタンスcalendarへセット
        calendar.set(year, month, day);
        //StringBuilderの生成
        StringBuilder strBuilder = new StringBuilder(calendar.toString());
        System.out.println("今日の日付は" + strBuilder.getClass());
        SimpleDateFormat sdf = new SimpleDateFormat("yy/mm/dd");
        strBuilder.append(year);
        strBuilder.append(month);
        strBuilder.append(day);

        Writer sw = new StringWriter();
        Reader sr = new StringReader(msg);
        char c1 = (char)sr.read(); /* c1には「第」が入る */
        char c2 = (char)sr.read(); /* c2には「１」が入る */
        /* : */
        System.out.println("第一文字は " + c1 +" 第二文字は " + c2);
    }
}       /* 参考：文字列に１文字ずつ書き込むStringWriterもある */