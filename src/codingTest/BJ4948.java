package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ4948 {
	public static void main(String[] args)  throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int result =0;
		for(int i=n;i<n*2;i++) {
			boolean isPrime = true;
			if(i==1) continue;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) result++;
		}
		System.out.println(result);
	}
}
