package com.in.String06;

import java.util.HashMap;
import java.util.Map;

public class Shift {
	public static boolean canShift(String s, String goal) {
		if (s.length() != goal.length()) {
			return false;
		}

		String concatenated = s + s;

		return concatenated.contains(goal);
	}

	public static void main(String[] args) {
		String s = "abcde";
		String goal = "cdeab";
		System.out.println(canShift(s, goal));

	}

}
