package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BJ1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = bf.readLine();
		String[] array = s.split("");
		Arrays.sort(array , Collections.reverseOrder());

		for(String a : array) {
			sb.append(a);
		}
		System.out.print(sb);
	}

}
