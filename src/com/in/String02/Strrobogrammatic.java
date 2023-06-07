package com.in.String02;

public class Strrobogrammatic {
	public static boolean isStrobogrammatic(String num) {
		int left = 0;
		int right = num.length() - 1;

		while (left <= right) {
			if (!isValidStrobogrammaticDigit(num.charAt(left)) || !isValidStrobogrammaticDigit(num.charAt(right))) {
				return false;
			}

			if (!isStrobogrammaticPair(num.charAt(left), num.charAt(right))) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

	private static boolean isValidStrobogrammaticDigit(char c) {
		return c == '0' || c == '1' || c == '6' || c == '8' || c == '9';
	}

	private static boolean isStrobogrammaticPair(char c1, char c2) {
		return (c1 == '0' && c2 == '0') || (c1 == '1' && c2 == '1') || (c1 == '6' && c2 == '9')
				|| (c1 == '8' && c2 == '8') || (c1 == '9' && c2 == '6');
	}

	public static void main(String[] args) {
		String num = "69";
		System.out.println(isStrobogrammatic(num));

	}

}
