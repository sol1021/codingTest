package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class BJ11651 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int[][] xy = new int[num][2];
		for(int i=0;i<num;i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}
		Arrays.sort(xy,(y1,y2)->{
			if(y1[1]==y2[1])
				return y1[0] - y2[0];
			else return y1[1]-y2[1];
		});
		for(int i =0;i<num;i++) {
			System.out.println(xy[i][0]+" "+xy[i][1]);
		}
		sc.close();
	}
}
