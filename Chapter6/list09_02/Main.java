package list09_02;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    	String path = new File(".").getAbsolutePath().toString();
    	StringBuilder sb1 = new StringBuilder(path);
    	int trim = path.indexOf('.');
    	String currentPath = sb1.deleteCharAt(trim).toString();
    	StringBuilder sb2 = new StringBuilder(currentPath);
        FileReader fw = new FileReader(sb2.append(".Unity.dat").toString());        // STEP1
        System.out.println("すべてのデータを読んで表示します");
        int i = fw.read();  /* 1文字読む */                     // STEP2
        while(i != -1) {    /* これ以上読めるデータがない場合は-1 */
            char c = (char) i;
            System.out.print(c);
            i = fw.read();
        }
        LineFeed();
        System.out.println("ファイルの末尾に到達しました");
        fw.close();                                             // STEP3
    }

    public static void LineFeed(){
    	System.out.println();
    }
}