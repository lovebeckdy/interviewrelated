package others;

import java.util.*;

public class RationalNumberDivision {
	public static String RationalNumberDivision(int dividend, int divisor) {
		StringBuilder ret = new StringBuilder();
		int real = dividend / divisor;
		ret.append(real).append('.');
		int rem = dividend % divisor;
		List<Integer> seen = new ArrayList<Integer>();
		List<Integer> mod = new ArrayList<Integer>();

		if (rem != 0) {
			rem *= 10;
			while (rem < divisor) {
				rem *= 10;
				ret.append('0');
			}
		}
		while (rem != 0) {
			int cur = rem / divisor;
			rem = rem % divisor;
			if (seen.contains(cur) && mod.get(seen.indexOf(cur))==rem) {
				int index = seen.indexOf(cur);
				for (int i = 0; i < index; i++)
					ret.append(seen.get(i));

				ret.append('(');
				for (int i = index; i < seen.size(); i++)
					ret.append(seen.get(i));
				ret.append(')');
				break;
			} else {
				seen.add(cur);
				mod.add(rem);
			}
			rem *= 10;
		}
		if (rem == 0) {
			for (int i = 0; i < seen.size(); i++)
				ret.append(seen.get(i));
			ret.append("(0)");
		}

		return ret.toString();
	}

	public static void main(String[] args) {
		System.out.println(RationalNumberDivision(5, 2));
		System.out.println(RationalNumberDivision(2, 2));
		System.out.println(RationalNumberDivision(3, 2));
		System.out.println(RationalNumberDivision(1, 2));
		System.out.println(RationalNumberDivision(5, 3));
		System.out.println(RationalNumberDivision(1, 3));
		System.out.println(RationalNumberDivision(2, 4));
		System.out.println(RationalNumberDivision(22, 7));
		System.out.println(RationalNumberDivision(58, 2828));
	}
}
