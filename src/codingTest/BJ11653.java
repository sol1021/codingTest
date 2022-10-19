package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11653 {
	public static void main(String[] args) throws IOException  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int s =2;
		while(n!=1) {
			if(n%s ==0) { 
				n /= s;
				System.out.println(s);
				s=2;
				continue;
			}
			else s++;
		}
	}
}
