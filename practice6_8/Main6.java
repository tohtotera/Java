import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main6 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		if (args.length < 3){
			System.out.println("ファイル名を指定してください。");
			System.exit(0);
		}

		String inputFileName = null;
		String outputFileName;
		FileReader fileReader = null;
		FileWriter fileWriter;
		BufferedReader br = null;
		BufferedWriter bw;

		try{
			inputFileName = currentPath.getPath() + "Unity.dat";
			fileReader = new FileReader(inputFileName);
			br = new BufferedReader(fileReader);
		}catch (IOException e){
			if (fileReader == null){
				System.out.println("ファイル：Unity.datが開けません。作成しますか？ => 1:yes  2:no");
				int yesno = new java.util.Scanner(System.in).nextInt();

				if (yesno == 1){
					FileCreate.create(inputFileName);
					System.exit(0);
				}else if (yesno == 2){
					System.exit(0);
				}else{
					System.out.println("１または２を入力してください。");
					System.exit(-1);
				}
			}
		}

		outputFileName = currentPath.getPath() + "UnityClone.dat";
		fileWriter = new FileWriter(outputFileName);
		bw = new BufferedWriter(fileWriter);

		String line = null;
		while ((line =br.readLine()) != null){
			bw.write(line);
			line = br.readLine();
		}
		bw.flush();
		bw.close();
		br.close();

		fileWriter.close();
		fileReader.close();

		System.out.println("Unity.datをUnityClone.datとしてコピーしました。");
	}
}
