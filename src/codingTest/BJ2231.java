package codingTest;

import java.util.*;
import java.util.stream.*;

public class BJ2231 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		int output= 0;
		for(int i=1;i<num;i++ ) {
			String str2 = String.valueOf(i);
			String[] arr2 = str2.split("");
			for(int j=0;j<arr2.length;j++) {
				sum+= Integer.parseInt(arr2[j]);
			}
			int result = sum + i;
			if(result ==num) { 
				output = i;
				break;
			}
			sum=0;
		}
		System.out.println(output);
		sc.close();
	}
}

