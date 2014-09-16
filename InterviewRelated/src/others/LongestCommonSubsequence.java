package others;

public class LongestCommonSubsequence {
	public static String LCS(String s1, String s2){
		int i = s1.length(), j = s2.length();
		if(i==0 || j==0) return "";
		else if(s1.charAt(i-1)==s2.charAt(j-1))
			return LCS(s1.substring(0,i-1), s2.substring(0,j-1))+s1.charAt(i-1);
		else{
			String tmp1 = LCS(s1.substring(0,i-1), s2);
			String tmp2 = LCS(s1, s2.substring(0,j-1));
			return tmp1.length()>tmp2.length()? tmp1:tmp2;
		}
	}
	
	public static void main(String[] args){
		System.out.println(LCS("abcdefg","bcdgk"));
		System.out.println(LCS("xmjyauz","mzjawxu"));
	}
}
