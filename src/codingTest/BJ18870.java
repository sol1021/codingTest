package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BJ18870 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int[] array = new int[num];
		int[] tmp = new int[num];
		for(int i=0;i<num;i++) {
			array[i] =Integer.parseInt(bf.readLine());
			tmp[i] =Integer.parseInt(bf.readLine());
		}
		int[] result =new int[num];
		Arrays.sort(tmp);
		for(int i=0;i<num;i++) {
		}
	}
}
