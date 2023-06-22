package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		
		String n = str[0];
		String m = str[1];
		int in = 0;
		int im =0;
		
		in  += Character.getNumericValue(n.charAt(2)) * 100;
		in  += Character.getNumericValue(n.charAt(1)) * 10;
		in  += Character.getNumericValue(n.charAt(0));
		
		im  += Character.getNumericValue(m.charAt(2)) * 100;
		im  += Character.getNumericValue(m.charAt(1)) * 10;
		im  += Character.getNumericValue(m.charAt(0));
		
		
		System.out.println(Math.max(in, im));
	}
}
