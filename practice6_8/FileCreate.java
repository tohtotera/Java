import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {
	public static void create(String fileName) throws IOException{
		FileWriter fr = new FileWriter(fileName);
		fr.write("Hello Unity");
		fr.flush();
		fr.close();
	}
}
