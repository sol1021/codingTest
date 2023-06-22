package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ5073 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		while((temp = bf.readLine()) != null) {
			if (temp.equals("0 0 0")) {
                break;
            }
			String[] s = temp.split(" ");
			int[] n = new int[3];
			for(int i=0;i<3;i++) {
				n[i] = Integer.parseInt(s[i]);
			}
			Arrays.sort(n);
			if(n[2] >= n[0] + n[1]) {
				System.out.println("Invalid");
			}
			else{
				if(s[0].equals(s[1]) && s[0].equals(s[2]))
					System.out.println("Equilateral");
				else if(s[0].equals(s[1]) || s[0].equals(s[2]) || s[1].equals(s[2]))
					System.out.println("Isosceles");
				else 
					System.out.println("Scalene");
			}
		}
	}
}
