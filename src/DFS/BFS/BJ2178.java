package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ2178 {
	static int N,M;
	static int[][] array;
	static boolean[][] visited;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	
	static void BFS(int y, int x) {
		visited[y][x] = true;
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {y,x});
		
		while(!que.isEmpty()) {
			int[] temp = que.poll();
			for(int i=0;i<4;i++) {
				int nx = temp[1] + dx[i];
				int ny = temp[0] + dy[i];
				if(nx >=0 && ny >=0 && nx < M && ny < N) {
					if(array[ny][nx]==1 && visited[ny][nx]==false) {
						que.add(new int[] {ny,nx});
						visited[ny][nx] = true;
						array[ny][nx] = array[temp[0]][temp[1]]+1;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		array = new int[N][M];
		visited = new boolean[N][M];
		
		
		for(int i=0;i<N;i++) {
			String[] s = bf.readLine().split("");
			for(int j=0;j<M;j++) {
				array[i][j] = Integer.parseInt(s[j]);
			}
		}	
		BFS(0,0);
		
		System.out.println(array[N-1][M-1]);
	}

}
