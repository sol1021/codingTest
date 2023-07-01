package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ7576 {
	static int M,N;
	static int[][] array;
	static boolean[][] visited;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static int count;
	static void BFS() {
		Queue<int[ ]> que = new LinkedList<>();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(array[i][j]==1) {
					que.add(new int[] {i,j});
				}
			}
		}
		while(!que.isEmpty()) {
			int[] temp = que.poll();
			for(int i=0;i<4;i++) {
				int nx = temp[1] + dx[i];
				int ny = temp[0] + dy[i];
				if(nx >=0 && ny >= 0 && nx<M && ny <N) {
					if(array[ny][nx]!=0) continue; 
					array[ny][nx] = array[temp[0]][temp[1]] + 1;
					que.add(new int[] {ny,nx});
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		array= new int[N][M];
		visited = new boolean[N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j=0;j<M;j++) {
				array[i][j] =  Integer.parseInt(st.nextToken()); 
			}
		}
		BFS();
		int max = 0;
		boolean check=false;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(array[i][j]==0) check=true;
				if(array[i][j] > max) max = array[i][j];
			}
			if(check) {
				max=0;
				break;
			}
		}
		System.out.println(max-1);
		}

}
