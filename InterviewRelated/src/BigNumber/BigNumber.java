package BigNumber;

public class BigNumber {
	public static String add(String num1, String num2){
		if(num1==null || num2==null) return null;
		if(num1.length()==0) return num2;
		if(num2.length()==0) return num1;
		int carry = 0;
		int[] num = new int[Math.max(num1.length(), num2.length())+1];
		int i = num1.length()-1, j = num2.length()-1, k = num.length-1;

		while(i>=0 && j>=0){
			int sum = num1.charAt(i)-'0' + num2.charAt(j)-'0'+carry;
			num[k] = sum%10;
			carry = sum/10;
			i--;
			j--;
			k--;
		}
		
		while(i>=0){
			int sum = num1.charAt(i)-'0'+carry;
			num[k] = sum%10;
			carry = sum/10;
			i--;
			k--;
		}
		
		while(j>=0){
			int sum = num2.charAt(j)-'0'+carry;
			num[k] = sum%10;
			carry = sum/10;
			j--;
			k--;
		}
		
		if(carry>0){
			num[k] = carry;
			k--;
		}
				
		StringBuilder ret = new StringBuilder();
		
		k=0;
		while(num[k]==0) k++;
		for(;k<num.length;k++)
			ret.append(num[k]);
		
		return new String(ret);
	}
	
	public static String multiply(String num1, String num2){
		if(num1==null || num2==null) return null;
		int n1 = num1.length(), n2 = num2.length(), n3 = n1+n2;
		int[] num = new int[n3];
		int carry, prod;
		for(int i=n1-1;i>=0;i--){
			carry = 0;
			for(int j=n2-1;j>=0;j--){
				prod = carry + num[i+j+1] + (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
				num[i+j+1] = prod%10;
				carry = prod/10;
			}
			num[i] = carry;
		}
		
		StringBuilder ret = new StringBuilder();
		int i = 0;
		while(i<n3-1 && num[i]==0) i++;
		while(i<n3)
			ret.append(num[i++]);
		
		return ret.toString();
	}
	
	public static void main(String[] argv){
		String num1 = "1234";
		String num2 = "56781234";
		// should be 56782468
		System.out.println(BigNumber.add(num1, num2));
		// should be 705774
		System.out.println(BigNumber.multiply("123","5738"));
	}
}
