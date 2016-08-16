package list10_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class Main {
	public static void main(String[] args) throws IOException{
		Hero hero = new Hero();
		saveHeroToFile(hero);
	}
    public static void saveHeroToFile(Hero h) throws IOException {
        Writer bw = new BufferedWriter(new FileWriter("rpgsave.dat"));

        /* リスト10-2　ここから */
        bw.write(h.name);
        bw.write(",");    /* デリミタの出力 */
        bw.write(h.hp);
        bw.write(",");
        bw.write(h.mp);
        /* リスト10-2　ここまで */

        bw.flush(); bw.close();
    }
}