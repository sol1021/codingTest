package codingTest;

import java.util.Scanner;

public class BJ2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			int s = sc.nextInt();
			String m = sc.next();
			for(int j=0;j<m.length();j++) {
				char c = m.charAt(j);
				for(int w =0;w<s;w++) {
					System.out.print(c);
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
