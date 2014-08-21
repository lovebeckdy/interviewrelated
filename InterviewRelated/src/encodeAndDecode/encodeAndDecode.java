package encodeAndDecode;

public class encodeAndDecode {
	public String encode(String s1, String s2){
		return "$"+String.valueOf(s1.length())+"$"+s1+s2;
	}
	
	public String[] decode(String encodedString){
		String[] ret = new String[2];
		// $ is the 'end of line' bound matcher in regex in java, have to do \\$ to escape that
		String[] tmp = encodedString.split("\\$");
		for(String t:tmp)
			System.out.println(t);
		int len1 = Integer.parseInt(tmp[1]);
		int start = tmp[1].length()+2;
		ret[0] = tmp[2].substring(0, len1);
		ret[1] = tmp[2].substring(len1);
		return ret;
	}
}
