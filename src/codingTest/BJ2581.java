package codingTest;

import java.util.Scanner;

public class BJ2581 {
	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int result=0;
		int min = 0;
		for(int i=m;i<=n;i++) {
			boolean isPrime = true;
			if(i==1) isPrime = false;
			for(int j =2;j<i;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				if(result ==0) min = i;
				result +=i;
			}
		}
		if(result ==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(result);
			System.out.println(min);
		}
		sc.close();
	}
}
