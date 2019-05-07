package com.kitri.io;

import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) {
		BufferedReader fin = null;
		FileWriter fw = null;
		try {
//			InputStream is = System.in;
//			Reader r = new InputStreamReader(is);
//			BufferedReader in = new BufferedReader(r);
			
			// 시스템에서 읽어라.
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("파일 이름 : ");
//			String infile = in.readLine();
//			System.out.println("infile == " + infile);

			//복사해올 파일 
			System.out.println("복사할 파일 이름 : ");
			String outfile = in.readLine();
			fw = new FileWriter(new File(outfile));
			
			
			// 파일에서 읽어라.
			fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(outfile))));
			String str = null;
			while((str = fin.readLine()) != null) {
				System.out.println(str);
				fw.write(str + "\r\n");
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
