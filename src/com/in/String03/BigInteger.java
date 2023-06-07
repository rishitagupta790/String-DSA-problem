package com.in.String03;

public class BigInteger {
	public static String addStrings(String num1, String num2) {
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		int carry = 0;
		StringBuilder result = new StringBuilder();

		while (i >= 0 || j >= 0) {
			int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
			int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

			int sum = digit1 + digit2 + carry;
			result.insert(0, sum % 10);
			carry = sum / 10;

			i--;
			j--;
		}

		if (carry > 0) {
			result.insert(0, carry);
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String num1 = "11";
		String num2 = "123";
		System.out.println(addStrings(num1, num2));
	}

}
