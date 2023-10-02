package java_study;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterApp {

	public static void main(String[] args) throws IOException {
		Writer fileWriter = new FileWriter("filewriter.txt");
		
		fileWriter.write("data1");
		fileWriter.write("data2");
		fileWriter.write("data3");
		
		fileWriter.close();		
	}
}
