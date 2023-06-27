package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2941 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] cro  = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String s = bf.readLine();
		int count=0;
		boolean check = false;
		
		while(true) {
			for(int i=0;i<cro.length;i++) {
				if(s.contains(cro[i])) {
					int temp = s.length() - s.replace(",", "").length();
					s = s.replace(cro[i],",");
					int temp2 = s.length() - s.replace(",", "").length();
					count+=temp2-temp;
				}
				else if(i==cro.length-1 && !s.contains(cro[i]))
					check=true;
			}
			if(check) break;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==',')continue;
			count++;
		}
		System.out.println(count);
	}
}
