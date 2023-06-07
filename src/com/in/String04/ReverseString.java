package com.in.String04;

import java.util.HashMap;
import java.util.Map;

public class ReverseString {
	public static String reverseWords(String s) {
		String[] words = s.split(" ");

		for (int i = 0; i < words.length; i++) {
			char[] charArray = words[i].toCharArray();
			int left = 0;
			int right = charArray.length - 1;

			while (left < right) {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}

			words[i] = String.valueOf(charArray);
		}

		return String.join(" ", words);
	}

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));

	}

}
