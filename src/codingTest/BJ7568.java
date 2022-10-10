package codingTest;

import java.util.Scanner;

public class BJ7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[][] person= new int [total][3];
		for(int i=0;i<total;i++) {
			person[i][0] =sc.nextInt();
			person[i][1] = sc.nextInt();
			person[i][2] = 1;
		}
		for(int i=0;i<total;i++) {
			for(int j =0;j<total;j++) {
				if(i==j) continue;
				if(person[i][0]<person[j][0] && person[i][1]<person[j][1]) {
					person[i][2]++;
				}
			}
		}
		for(int i=0;i<total;i++) {
			System.out.print(person[i][2]+" ");
		}
		sc.close();
	}

}
