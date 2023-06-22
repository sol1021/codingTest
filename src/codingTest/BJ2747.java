package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2747 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int one = 0;
		int two = 1;
		int result = 0;
		if(n == 1) System.out.println(1);
		else {
			for(int i=1;i<n;i++) {
				result = one + two;
				one = two;
				two = result;
			}
			System.out.println(result);
		}
	}
}
