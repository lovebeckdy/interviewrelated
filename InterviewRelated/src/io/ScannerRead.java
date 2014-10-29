package io;
import java.util.Scanner;
import java.io.*;

public class ScannerRead {
	public static void main(String[] args) throws Exception{
		Scanner s = null;
		BufferedWriter out = null;
		File fin = new File("src/io/read.txt");
		File fout = new File("src/io/scannerwrite.txt");
		try{
			s = new Scanner(new BufferedReader(new FileReader(fin)));
			out = new BufferedWriter(new FileWriter(fout));
			while(s.hasNext()){
				out.write(s.next());
				if(s.hasNext()) out.write(" ");
			}
			
		}finally{
			if(s!=null) s.close();
			if(out!=null) out.close();
		}
	}
}
