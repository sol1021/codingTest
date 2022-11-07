package codingTest;
import java.util.Scanner;

public class BJ2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] array1 = new int[n][m];
		int[][] array2 = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				array1[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				array2[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				array1[i][j] += array2[i][j];
				if(j==m-1) System.out.print(array1[i][j]);
				else System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
