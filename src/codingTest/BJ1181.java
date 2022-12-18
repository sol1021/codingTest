package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BJ1181 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		String[] array = new String[num];
		for(int i=0;i<num;i++) {
			array[i] = bf.readLine();
		}
		Arrays.sort(array,new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length()==s2.length()) {
					return s1.compareTo(s2);
				}
				return s1.length() - s2.length();
			}
		});
		for(int i=0;i<num;i++) {
			if(i>0 && array[i].equals(array[i-1])) continue;
			else System.out.println(array[i]);
		}
	}
}
