package others;
import java.util.*;

public class GenerateThreeKindsOfParentheses {
	public static void main(String[] args) {
		ArrayList<String> result = generate(1, 2, 2);
		for (String s : result) {
			System.out.println(s);
		}
	}

	public static ArrayList<String> generate(int n1, int n2, int n3) {
		ArrayList<String> result = new ArrayList<String>();
		if (n1 == 0 && n2 == 0 && n3 == 0) {
			return result;
		}
		StringBuilder sb = new StringBuilder();
		Stack<Integer> st = new Stack<Integer>();
		helper(n1, n2, n3, 0, 0, 0, 0, 0, 0, sb, result, st);
		return result;
	}

	public static void helper(int n1, int n2, int n3, int left1, int right1,
			int left2, int right2, int left3, int right3, StringBuilder sb,
			ArrayList<String> result, Stack<Integer> st) {
		if (right1 == n1 && right2 == n2 && right3 == n3) {
			result.add(sb.toString());
			return;
		}
		if (left1 < n1) {
			sb.append('(');
			st.push(1);
			helper(n1, n2, n3, left1 + 1, right1, left2, right2, left3, right3,
					sb, result, st);
			sb.deleteCharAt(sb.length() - 1);
			st.pop();
		}
		if (right1 < left1 && st.peek() == 1) {
			sb.append(')');
			st.pop();
			helper(n1, n2, n3, left1, right1 + 1, left2, right2, left3, right3,
					sb, result, st);
			sb.deleteCharAt(sb.length() - 1);
			st.push(1);
		}
		if (left2 < n2) {
			sb.append('[');
			st.push(2);
			helper(n1, n2, n3, left1, right1, left2 + 1, right2, left3, right3,
					sb, result, st);
			sb.deleteCharAt(sb.length() - 1);
			st.pop();
		}
		if (right2 < left2 && st.peek() == 2) {
			sb.append(']');
			st.pop();
			helper(n1, n2, n3, left1, right1, left2, right2 + 1, left3, right3,
					sb, result, st);
			sb.deleteCharAt(sb.length() - 1);
			st.push(2);
		}
		if (left3 < n3) {
			sb.append('{');
			st.push(3);
			helper(n1, n2, n3, left1, right1, left2, right2, left3 + 1, right3,
					sb, result, st);
			sb.deleteCharAt(sb.length() - 1);
			st.pop();
		}
		if (right3 < left3 && st.peek() == 3) {
			sb.append('}');
			st.pop();
			helper(n1, n2, n3, left1, right1, left2, right2, left3, right3 + 1,
					sb, result, st);
			sb.deleteCharAt(sb.length() - 1);
			st.push(3);
		}
	}
}
