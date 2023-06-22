package codingTest;

import java.util.*;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ20053 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		for(int i=0;i<n;i++) {
			int m =  Integer.parseInt(bf.readLine());
			String[] s = bf.readLine().split(" ");
			int[] newArr = Stream.of(s).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(newArr);
			System.out.println(newArr[0] + " "+ newArr[newArr.length-1]);
		}
	}
}
