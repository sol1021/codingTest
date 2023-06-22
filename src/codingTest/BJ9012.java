package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		for(int i=0;i<n;i++) {
			String s = bf.readLine();
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(count==0 && s.charAt(j)==')') {
					count--;
					break;
				}
				else {
					if(s.charAt(j)=='(') count++;
					else count--;
				}
			}
			if(count !=0) System.out.println("NO");
			else System.out.println("YES");
		}
	}
}
