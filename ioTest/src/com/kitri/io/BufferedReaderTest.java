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
			
			// �ý��ۿ��� �о��.
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("���� �̸� : ");
//			String infile = in.readLine();
//			System.out.println("infile == " + infile);

			//�����ؿ� ���� 
			System.out.println("������ ���� �̸� : ");
			String outfile = in.readLine();
			fw = new FileWriter(new File(outfile));
			
			
			// ���Ͽ��� �о��.
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
