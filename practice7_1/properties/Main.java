package properties;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Reader fr = new FileReader("C:\\eclipse\\pleiades\\workspace\\Java実践\\practice7_1\\properties\\pref.properties");
		Properties p = new Properties();
		p.load(fr);
		String capital = p.getProperty("aichi.capital");
		String food = p.getProperty("aichi.food");
		System.out.println(capital + ":" + food);
		fr.close();
	}

}
