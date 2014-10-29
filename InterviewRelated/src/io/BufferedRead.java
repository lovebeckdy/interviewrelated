package io;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class BufferedRead {
	public static void main(String[] args) throws Exception{
		BufferedReader in = null;
		BufferedWriter out = null;
		File fin = new File("src/io/read.txt");
		File fout = new File("src/io/bufwrite.txt");
		try{
			in = new BufferedReader(new FileReader(fin));
			out = new BufferedWriter(new FileWriter(fout));
			int c;
			while((c=in.read())!=-1)
				out.write(c);
		}finally{
			if(in!=null) in.close();
			if(out!=null) out.close();
		}
	}
}
