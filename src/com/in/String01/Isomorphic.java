package com.in.String01;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Character> charMapS = new HashMap<>();
		Map<Character, Character> charMapT = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);

			if (!charMapS.containsKey(sChar)) {
				charMapS.put(sChar, tChar);
			//	System.out.println(sChar + tChar  );
			//	System.out.println(charMapS.get(sChar) + tChar);
			} else if (charMapS.get(sChar) != tChar) {
				return false;
			}

			if (!charMapT.containsKey(tChar)) {
				charMapT.put(tChar, sChar);
			} else if (charMapT.get(tChar) != sChar) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String s = "egg";
		String t = "add";
		System.out.println(isIsomorphic(s, t));

	}

}
