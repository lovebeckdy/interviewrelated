package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;

public class ByteRead {
	public static void main(String[] args) throws Exception{
		FileInputStream in = null;
		FileOutputStream out = null;
		File fin = new File("src/io/read.txt");
		File fout = new File("src/io/bytewrite.txt");
		try{
			// default location is dir containing src and bin of the project
			in = new FileInputStream(fin);
			out = new FileOutputStream(fout);
			int c;
			while((c=in.read())!=-1){
				out.write(c);
			}
		}finally{
			if(in!=null) in.close();
			if(out!=null) out.close();
		}
	}
}
