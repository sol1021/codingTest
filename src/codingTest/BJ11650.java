package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class BJ11650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[][] xy = new int[total][3];
		for(int i=0;i<total;i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
			xy[i][2] = 0;
		}
		Arrays.sort(xy,(x1,x2)->{
			if(x1[0]==x2[0]) return x1[1]-x2[1];
			else return x1[0] - x2[0];
		});
		for(int i=0;i<total;i++) {
				System.out.println(xy[i][0] + " "+ xy[i][1]);
		}
		sc.close();
	}

}
