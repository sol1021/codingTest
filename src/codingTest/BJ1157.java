package codingTest;

import java.util.Scanner;

public class BJ1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch='?';
		s = s.toUpperCase();
		int[] result = new int[26];
		for(int i =0;i<s.length();i++) {
			result[s.charAt(i)-65]++;
		}
		int max =-1;
		for (int i = 0; i < 26; i++) {
			if (result[i] > max) {
				max = result[i];
				ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
			}
			else if (result[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
		sc.close();
	}
}
