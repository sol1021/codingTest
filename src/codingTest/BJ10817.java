package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ10817 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		int[] num = new int[str.length];
		
		for(int i=0;i<num.length;i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(num);
		
		System.out.println(num[1]);
	}
}
