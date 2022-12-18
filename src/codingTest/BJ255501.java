package codingTest;

import java.util.Scanner;

public class BJ255501 {

	public static void recursion(String s, int l, int r, int n) {
		if (l >= r) System.out.println(1 + " " + n);
		else if (s.charAt(l) != s.charAt(r))
			System.out.println(0 + " " + n);
		else recursion(s, l + 1, r - 1,++n);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int n = 0;
			String s = sc.next();
			recursion(s, 0, s.length()-1, ++n);
		}
		sc.close();
	}
}