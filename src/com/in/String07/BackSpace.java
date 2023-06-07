package com.in.String07;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BackSpace {
	public static boolean backspaceCompare(String s, String t) {
		return buildString(s).equals(buildString(t));
	}

	private static String buildString(String str) {
		Stack<Character> stack = new Stack<>();

		for (char c : str.toCharArray()) {
			if (c != '#') {
				stack.push(c);
			} else if (!stack.isEmpty()) {
				stack.pop();
			}
		}

		return String.valueOf(stack);
	}

	public static void main(String[] args) {
		String s = "ab#c";
		String t = "ad#c";
		System.out.println(backspaceCompare(s, t));

	}

}
