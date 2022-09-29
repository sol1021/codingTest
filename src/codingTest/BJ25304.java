package codingTest;

import java.util.Scanner;

public class BJ25304 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int num = sc.nextInt();
		int result = 0;
		for(int i =0;i<num;i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			result += n1 * n2;
		}
		if(sum ==result) System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}
}
