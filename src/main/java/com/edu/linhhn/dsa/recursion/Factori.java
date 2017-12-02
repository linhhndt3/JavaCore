package com.edu.linhhn.dsa.recursion;

public class Factori {
	public static void main(String[] args) {
		System.out.println(isParadolime("abcefcba", 0, 7));
	}
	
	public static int fac(int n) {
		if(n == 0)
			return 1;
		return n * fac(n-1);
	}
	
	public static int sum(int n) {
		if(n == 1) {
			return 1;	// base case
		}
		return n + sum(n - 1); // recusive call
	}
	
	public static int m(int n) {
		if(n == 0) {
			return 2;
		}
		
		return 2 * m(n - 1);
	}
	
	private static boolean isParadolime(String s, int p1, int p2) {
		if(s.length() == 1) {
			return true;
		}
		if(p1 == p2 || p1 > p2) {
			return true;
		}
		if(s.charAt(p1) != s.charAt(p2)) {
			return false;
		}
		
		return isParadolime(s, p1 + 1, p2 - 1);
	}
}
