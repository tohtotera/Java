package list10_01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class Main {
	public static void main(String[] args) throws IOException{
		Hero hero = new Hero();
		saveHeroToFile(hero);

		/* リスト10-1　ここから */
		/*
		public void saveHeroToFile(Hero h) throws IOException {
			Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));
			w.write(h.name + "\n");     // 名前の末尾に改行をつけ保存
			w.write(h.hp + "\n");       // HPの末尾に改行をつけ保存
			w.write(h.mp + "\n");       // MPの末尾に改行をつけ保存
			w.flush();
			w.close();
		}
        /* リスト10-1　ここまで */
	}

	private static void saveHeroToFile(Hero h) throws IOException {
		Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));
		w.write(h.name + "\n");     // 名前の末尾に改行をつけ保存
		w.write(h.hp + "\n");       // HPの末尾に改行をつけ保存
		w.write(h.mp + "\n");       // MPの末尾に改行をつけ保存
		w.flush();
		w.close();
		// TODO 自動生成されたメソッド・スタブ
	}

}