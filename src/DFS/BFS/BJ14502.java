package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ14502 {
	static int N,M;
	static int[][] array;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0,1, -1,};
	static int  max;
	
	static void BFS() {
		Queue<int[]> que = new LinkedList<>();
		int[][] map = new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				map[i][j] = array[i][j];
				if(array[i][j]==2) {
					que.add(new int[] {i,j});
				}
			}
		}
		
		while(!que.isEmpty()) {
			int[] temp = que.poll();
			for(int i=0;i<4;i++) {
				int ny = temp[0] + dy[i];
				int nx = temp[1] + dx[i];
				if(ny >=0 && ny <N && nx >=0 && nx<M) {
					if(map[ny][nx] ==0) {
						map[ny][nx] =2;
						que.add(new int[] {ny, nx});
					}
				}
			}
		}
		int count=0;
		count = checkSafeZone(map, count);
		if(max < count) max = count;
	}
	
	static void DFS(int n) {
		if(n==3) {
			BFS();
		}
		else {
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(array[i][j]==0) {
						array[i][j]=1;
						DFS(n+1);
						array[i][j]=0;
					}
				}
			}
		}
	}
	
	static int checkSafeZone(int[][] map, int count) {
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j]==0) {
					count++;
				}
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M= Integer.parseInt(st.nextToken());
		
		array = new int[N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j=0;j<M;j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		max = 0;
		DFS(0);
		System.out.println(max);
	}

}
