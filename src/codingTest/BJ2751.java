package codingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BJ2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> array =  new ArrayList<>();
		for(int i=0;i<n;i++) {
			array.add(sc.nextInt());
		}
		Collections.sort(array);
		for(int value : array) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
		sc.close();
	}
}
