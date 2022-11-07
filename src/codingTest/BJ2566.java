package codingTest;
import java.util.Scanner;

public class BJ2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array1 = new int[9][9];
		int maxNum = 0;
		int x=0, y=0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				array1[i][j] = sc.nextInt();
				if(maxNum<=array1[i][j]) {
					maxNum = array1[i][j];
					x=i+1;
					y=j+1;
				}
			}
		}
		System.out.println(maxNum);
		System.out.println(x + " " + y);
	}
}
