//시간초과
package codingTest;

import java.util.Scanner;

public class BJ9020 {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int s = sc.nextInt();
		for(int i=0;i<s;i++) {
			int n = sc.nextInt();
			int prime1=0,prime2=0;
			for(int j=2;j<=n-2;j++) {
				if(isPrime(j) && isPrime(n-j)) {
					if(prime1 != 0) {
						int a = Math.abs(prime1-prime2);
						if(j-(n-j)==0) {
							prime1=j;
							prime2=n-j;
							break;
						}
						else if(a < j-(n-j)) break;
						else {
							prime1 =j;
							prime2=n-j;
						}
					}
					else {
							prime1=j;
							prime2=n-j;
					}
				} 
			}
			System.out.println(prime2+" " +prime1);
		}
	}
	public static boolean  isPrime(int n) {
		boolean prime = true;
		for(int i =2;i<n;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		return prime;
	}
	
}
