package com.in.String05;

import java.util.HashMap;
import java.util.Map;

public class IndexBasedReverse {
	public static String reverseStr(String s, int k) {
		char[] charArray = s.toCharArray();

		for (int i = 0; i < charArray.length; i += 2 * k) {
			int left = i;
			int right = Math.min(i + k - 1, charArray.length - 1);

			while (left < right) {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}
		}

		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		System.out.println(reverseStr(s, k));

	}

}
