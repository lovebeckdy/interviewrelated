package io;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterRead {
	public static void main(String[] args) throws Exception{
		FileReader in = null;
		FileWriter out = null;
		File fin = new File("src/io/read.txt");
		File fout = new File("src/io/chawrite.txt");
		try{
			in = new FileReader(fin);
			out = new FileWriter(fout);
			int c;
			while((c=in.read())!=-1)
				out.write(c);
		}finally{
			if(in!=null) in.close();
			if(out!=null) out.close();
		}
	}
}
