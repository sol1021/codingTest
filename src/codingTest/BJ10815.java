package codingTest;

import java.util.Scanner;

public class BJ10815 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int youNumber = sc.nextInt();
		int[] youCard = new int[youNumber];
		for(int i=0;i<youNumber;i++) {
			youCard[i] = sc.nextInt();
		}
		int myNumber = sc.nextInt();
		int[] myCard = new int[myNumber];
		int[] result = new int[myNumber];
		for(int i=0;i<myNumber;i++) {
			myCard[i] = sc.nextInt();
		}
		for(int i=0;i<myNumber;i++) {
			for(int j =0;j<youNumber;j++) {
				if(myCard[i]==youCard[j])
					result[i]=1;
			}
			if(result[i]!=1) result[i]=0;
			System.out.print(result[i] + " ");
		}
		sc.close();
	}

}
