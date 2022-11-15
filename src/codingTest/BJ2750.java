package codingTest;

import java.util.Scanner;

public class BJ2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		for(int i=1;i<n;i++) {
			int target = array[i];
			int j = i -1;
			while(j>=0 && target < array[j]) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = target;
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		sc.close();
	}
}
