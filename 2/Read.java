import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read{

	public static void main(String[] args) {
		BufferedReader reader;
		// FileOutputStream fos = null;
		String str;
		FileWriter fw = null;
		BufferedWriter bw;
		try {
			reader = new BufferedReader(new FileReader("input2.txt"));
			// fos = new FileOutputStream("output.txt");
			fw = new FileWriter("output2.txt", true);
			int a;
			bw = new BufferedWriter(new FileWriter("output2.txt"));

			System.out.println("Reading Input ...");
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				a=Integer.parseInt(line);
				a= 2*a;
				str=Integer.toString(a);
				str=str.concat("\n");
				bw.write(str);
				bw.newLine();
				bw.flush();
				// System.out.println(str);
				line = reader.readLine();
			}
			System.out.println("File write to Output file success.");
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
