package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1225 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = bf.readLine().split(" ");
		long result = 0;
		
		String sn = strArr[0];
		String sm = strArr[1];

		for (int i = 0; i < sn.length(); i++) {
			for (int j = 0; j < sm.length(); j++) {
				int one = Character.getNumericValue(sn.charAt(i));
				int two = Character.getNumericValue(sm.charAt(j));
				result += one * two;
			}
		}
		System.out.println(result);
	}

}
