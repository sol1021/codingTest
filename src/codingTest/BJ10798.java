package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10798 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[5];
		for(int i=0;i<5;i++) {
			str[i] = bf.readLine();
		}
		int count=0;
		boolean check = false;
		StringBuilder sb = new StringBuilder();
		while(true) {
			for(int i=0;i<5;i++) {
				if(str[i].length()-1>=count) {
					sb.append(str[i].charAt(count));
					check= true;
				}
			}
			count++;
			if(check==false) break;
			else check=false;
		}
		System.out.println(sb);
	}

}
