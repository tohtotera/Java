package practice8_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlGet {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String fname = "favicon.ico";
		FileOutputStream outfile = new FileOutputStream(fname); 
		URL url = new URL("http://dokojava.jp/favicon.ico");
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		int i = isr.read();
		while (i != -1){
			outfile.write(i);
			i = isr.read();
		}
		outfile.close();
	}

}
