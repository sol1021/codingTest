package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ2667 {
	
	public static int dfs(int i, int j) {
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[][] map = new int[num][num];
		boolean[][] visited = new boolean[num][num];
		ArrayList<Integer> result  = new ArrayList<Integer>();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				map[i][j] = sc.nextInt();
				visited[i][j] = false;
			}
		}
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(map[i][j] == 1 && visited[i][j] ==false) {
					result.add(dfs(i,j));
				}
			}
		}
		
	}
}
