package list11_01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
	// 解説のために例外処理を省略しています
	// 実際に利用する際は正しくtry-catchしてください
    public static void main(String[] args) throws IOException {
        FileOutputStream fname = new FileOutputStream("url.txt", false);
        URL url = new URL("http://dokojava.jp");
        InputStream is = url.openStream();
        InputStreamReader isr = new InputStreamReader(is);
        int i = isr.read();
        while(i != -1) {
            fname.write(i);
            i = isr.read();
        }
        isr.close();
    }
}