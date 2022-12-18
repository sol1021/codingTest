package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ10989 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n =Integer.parseInt(bf.readLine());
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] =Integer.parseInt(bf.readLine());
		}
		Arrays.sort(array);
		for(int value : array) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}