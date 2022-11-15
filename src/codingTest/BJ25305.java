package codingTest;

import java.util.Scanner;

public class BJ25305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] array = new int[num];
		int cut = sc.nextInt();
		for(int i=0;i<num;i++) {
			array[i] = sc.nextInt();
		}
		for(int i=1;i<num;i++) {
			int target = array[i];
			int j = i -1;
			while(j >= 0 && target > array[j]) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = target;
		}
		System.out.println(array[cut-1]);
	}
}
