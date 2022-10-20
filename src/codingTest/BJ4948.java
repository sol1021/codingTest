package codingTest;

import java.util.Scanner;

public class BJ4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			
			int result =0;
			for(int i=n+1;i<=n*2;i++) {
				if(n==1) {
					result=1;
					break;
				}
				boolean isPrime = true;
				for(int j=2;j<=(int)Math.sqrt(i);j++) {
					if(i%j==0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) result++;
			}
			System.out.println(result);
		}
		sc.close();
	}
}
