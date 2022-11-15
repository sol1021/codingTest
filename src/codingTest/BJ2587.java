package codingTest;

import java.util.Scanner;

public class BJ2587 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		int sum = a[0];
		for(int i=1;i<5;i++) {
			sum += a[i];
			int target = a[i];
			int j = i -1;
			while(j>=0 && target < a[j]) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = target;
		}
		System.out.println((int)sum /5);
		System.out.println(a[2]);
		sc.close();
	}
}
