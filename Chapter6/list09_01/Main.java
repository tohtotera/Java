package list09_01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    	StringBuilder sb = new StringBuilder();
    	String path = new File(".").getAbsolutePath();
        FileWriter fw = new FileWriter(sb.append(path).append("Unity.dat").toString(), true);
        //FileWriter fw = new FileWriter("Unity_Current.dat",true);												// STEP1
        fw.write("Hello Unity");                                  // STEP2
        fw.flush();
        //fw.write('o');
        //fw.flush();
        fw.close();                                     // STEP3
    }
}