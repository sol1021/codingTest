package codingTest;

import java.util.Scanner;

public class BJ2606 {
	static int a[][];
	static boolean visited[];
	static int count=0;
	
	static int DFS(int v) {
		visited[v] = true;
		for(int i=1;i<a.length;i++) {
			if(a[v][i]==1 && visited[i]==false) {
				count++;
				DFS(i);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int inputNum = sc.nextInt();
		a = new int[num+1][num+1];
		visited = new boolean[num+1];
		
		
		for(int i=0;i<inputNum;i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			a[n][m] = 1;
			a[m][n] = 1;
		}
		System.out.println(DFS(1));
	}

}
