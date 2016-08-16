package practice7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		//田中さんのインスタンスを生成
		Employes tanaka = new Employes();
		tanaka.name = "田中　太郎";
		tanaka.age  = 41;
		//部署のインスタンスを生成
		Department busho = new Department();
		busho.name = "総務部";
		busho.leader = tanaka;
		//書き込みの準備・ファイル[company.txt]を開く
		FileOutputStream fos = new FileOutputStream("company.txt");
		ObjectOutputStream streamOut = new ObjectOutputStream(fos);
		//部署クラスの書き込み
		streamOut.writeObject(busho);
		streamOut.flush();
		streamOut.close();
		//company.txtをひき読み込みの準備
		FileInputStream fis = new FileInputStream("company.txt");
		ObjectInputStream streamIn = new ObjectInputStream(fis);
		Department bushoOftanaka = (Department)streamIn.readObject();
		System.out.println("部署名：" + bushoOftanaka.name);
		System.out.println("氏名：" + bushoOftanaka.leader.name);
		System.out.println("年齢：" + bushoOftanaka.leader.age);
		fis.close();
	}

}
