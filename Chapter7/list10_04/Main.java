package list10_04;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("C:\\eclipse\\pleiades\\workspace\\Java実践\\rpgdata.properties");
        Properties p = new Properties();
        p.load(fr);                                 /* ファイル内容を読み込む */
        String name = p.getProperty("heroName");    /* キーを指定し値を取り出す */
        String strHp = p.getProperty("heroHp");
        int hp = Integer.parseInt(strHp);
        System.out.println("勇者の名前：" + name);
        System.out.println("勇者のHP：" + hp);
        fr.close();
    }
}