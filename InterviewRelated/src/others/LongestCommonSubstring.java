package others;

public class LongestCommonSubstring {
	public static void main(String[] args) {
		System.out.println(compute("ascddd", "abascdd", 4));
	}
	
	/*
	 * f[i][j] means the length of common substring between substring s1[0,...i], ending 
	 * at i inclusive and substring s2[0...j], ending at j inclusive.
	 */
	public static boolean compute(String s1, String s2, int n) {
		int len1 = s1.length();
		int len2 = s2.length();
		int[][] f = new int[len1+1][len2+1];
		for (int i = 0; i <= len1; i++) {
			for (int j = 0; j <= len2; j++) {
				if (i == 0 || j == 0) {
					f[i][j] = 0;
				}
				else {
					if (s1.charAt(i-1) == s2.charAt(j-1)) {
						f[i][j] = f[i-1][j-1] + 1;
					}
					else {
						f[i][j] = 0;
					}
				}
				if (f[i][j] >= n) {
					return true;
				}
			}
		}
		return false;
	}
}
