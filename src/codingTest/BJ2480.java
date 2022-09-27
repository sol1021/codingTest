package codingTest;

import java.util.Scanner;

public class BJ2480 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int[] n = {a1, a2, a3};
		if(a1==a2) {
			if(a2==a3)
				sum +=10000+(a1*1000);
			else sum += 1000+(a1*100);
		}
		else if(a2==a3) {
			if(a1==a3) sum +=10000+(a1*1000);
			else sum += 1000+(a2*100);
		}
		else if(a1==a3) {
			if(a2==a3) sum +=10000+(a1*1000);
			else sum += 1000+(a1*100);
		}
		else if(a1!=a2 && a2!=a3) {
			int max = n[0];
			for(int i=1;i<n.length;i++) {
				if(n[i]>max) max = n[i];
			}
			sum += max *100;
		}
		System.out.println(sum);
		sc.close();

	}

}
