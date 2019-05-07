package com.kitri.io;

import java.io.*;

public class FileReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			File infile = new File("E:\\iotest\\hello.txt");
			fr = new FileReader(infile);
			long length = infile.length();
			char c[] = new char[(char) length];
			int x = fr.read(c);
			System.out.println(x);
			String str = new String(c);
			System.out.println(str);

			File outfile = new File("E:\\iotest\\hello_copy2.txt");
			fw = new FileWriter(outfile);
			fw.write(str);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
