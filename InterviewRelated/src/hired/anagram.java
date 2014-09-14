package hired;

public class anagram {
	public static void check_anagrams(String[] firstWords, String[] secondWords) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        for(int i=0;i<firstWords.length;i++){
        	if(firstWords[i].length()!=secondWords[i].length()){
        		System.out.println("0");
        		continue;
        	}
        	int[] count1 = new int[26];
        	int[] count2 = new int[26];
        	for(int j=0;j<firstWords[i].length();j++){
        		count1[firstWords[i].charAt(j)-'a']++;
        		count2[secondWords[i].charAt(j)-'a']++;
        	}
        	if(rsHash(count1)==rsHash(count2)){
        		System.out.println("1");
        	}
        	else{
        		System.out.println("0");
        	}
        }
    }
	
	private static int rsHash(int[] num){
        int hash = 0;
        int a = 378551;
        int b = 63689;
        for(int i:num){
            hash = hash*a+i;
            a *= b;
        }
        return hash;
    }
}
