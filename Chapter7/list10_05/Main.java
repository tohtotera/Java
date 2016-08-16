package list10_05;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        Writer fw = new FileWriter("C:\\eclipse\\pleiades\\workspace\\Java実践\\rpgsave.properties");
        Properties p = new Properties();
        p.setProperty("heroName", "アサカ");        /* データのセット */
        p.setProperty("heroHp", "62");
        p.setProperty("heroMp", "45");
        p.store(fw, "勇者の情報");                  /* ファイルへ書き出す */
        fw.close();                             /* ファイルの先頭にコメントとして出力される */
    }
}