package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m =Integer.parseInt(st.nextToken());
		for(int i=n;i<=m;i++) {
			boolean isPrime = true;
			if(i==1) continue;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) System.out.println(i);
		}
	}
}
