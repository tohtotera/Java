package list09_03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    	StringBuilder sb = new StringBuilder();
    	sb = StringBuilderSetUp();
    	//バイナリファイルの書き込み
        FileOutputStream fos =
        		new FileOutputStream((sb.append("\\Chapter6\\list09_03\\Hello.dat").toString()), true);
        fos.write(0x41);      // 65は2進数で 01000001
        fos.flush();
        fos.close();
        //バイナリファイルの読み込み・表示
        FileInputStream fis = new FileInputStream(sb.toString());
        int c =fis.read();
        while (c != -1){
        	System.out.println((char)c);
        	c = fis.read();
        }
    }

    public static StringBuilder StringBuilderSetUp(){
    	
    	String path = new File(".").getAbsolutePath().toString();
    	StringBuilder sb1 = new StringBuilder(path);
    	int trim = path.indexOf('.');
    	String currentPath = sb1.deleteCharAt(trim).toString();
    	StringBuilder sb2 = new StringBuilder(currentPath);
    	return sb2;
    }
}