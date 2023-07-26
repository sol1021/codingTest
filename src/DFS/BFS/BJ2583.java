package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ2583 {
	static int[][] array;
	static boolean[][] visited;
	static int M, N, K;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = { 0, 0, -1, 1};
	static int count;
	
	static void DFS(int y, int x) {
		visited[y][x] = true;
		for(int i=0;i<4;i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if(ny>=0 && nx>=0 && ny<M && nx<N) {
				if(array[ny][nx]==0 && visited[ny][nx]==false) {
					DFS(ny,nx);
					count++;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		array = new int[M][N];
		visited = new boolean[M][N];
		
		for(int i=0;i<K;i++) {
			st = new StringTokenizer(bf.readLine());
			int lx = Integer.parseInt(st.nextToken());
			int ly = Integer.parseInt(st.nextToken());
			int rx = Integer.parseInt(st.nextToken());
			int ry = Integer.parseInt(st.nextToken());
			for(int j=ly;j<ry;j++) {
				for(int k=lx;k<rx;k++) {
					array[j][k] = 1;
				}
			}
		}
		int num=0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(array[i][j]==0 && visited[i][j]==false) {
					num++;
					count=1;
					DFS(i,j);
					list.add(count);
				}
			}
		}
		System.out.println(num);
		Collections.sort(list);
		for(int x : list) {
			System.out.print(x+ " ");
		}
	}

}
