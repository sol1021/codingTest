package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1012 {
	static int M, N, K;
	static int[][] array;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};	
	
	static void DFS(int y, int x) {
		visited[y][x] = true;
		for(int i=0;i<4;i++) {
			int ny = y + dy[i]; 
			int nx = x + dx[i];
			if(ny>=0 && nx>=0 && ny < N && nx <M) {
				if(array[ny][nx]==1 && visited[ny][nx]==false) {
					visited[ny][nx] = true;
					DFS(ny,nx);
				}
			} 
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int T= Integer.parseInt(st.nextToken());
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(bf.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			array = new int[N][M];
			visited = new boolean[N][M];
			
			for(int j=0;j<K;j++) {
				st = new StringTokenizer(bf.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				array[y][x] = 1;
			}
			int count=0;
			for(int k=0;k<N;k++) {
				for(int l=0;l<M;l++) {
					if(array[k][l]==1 && visited[k][l]==false) {
						DFS(k,l);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

}
