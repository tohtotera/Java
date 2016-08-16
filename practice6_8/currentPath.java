import java.io.File;

public class currentPath {
	static StringBuilder sb;
	static String path;

	currentPath(){
		sb = new StringBuilder();
		sb = StringBuilderSetUp();
	}

	public static String getPath(){
		path = sb.append("\\Chapter6\\practice6_8\\").toString();
		return path;
	}

	 public StringBuilder StringBuilderSetUp(){

	    	String path = new File(".").getAbsolutePath().toString();
	    	StringBuilder sb1 = new StringBuilder(path);
	    	int trim = path.indexOf('.');
	    	String currentPath = sb1.deleteCharAt(trim).toString();
	    	StringBuilder sb2 = new StringBuilder(currentPath);
	    	return sb2;
	 }
}
