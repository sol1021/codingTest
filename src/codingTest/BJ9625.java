package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9625 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		StringBuilder sbs = new StringBuilder();
		sb.append("BAB");
		sbs.append("BA");
		for(int i=2;i<n;i++) {
			sb.append(sbs);
			
		}
		System.out.println(sb);
		
		
	}
}
