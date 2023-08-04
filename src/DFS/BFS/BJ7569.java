package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ7569 {
	static int N, M, H;
	static int[][][] tomato;
	static boolean[][][] visited;
	static int[] dx = {0, 0, -1, 1, 0, 0};
	static int[] dy = { -1, 1,0, 0, 0, 0};
	static int[] dh = {0, 0, 0, 0, -1, 1};
	
	static void BFS() {
		Queue<int[]> que = new LinkedList<>();
		for(int i=0;i<H;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<M;k++) {
					if(tomato[i][j][k]==1) {
						que.add(new int[] {i, j, k});
					}
				}
			}
		}
		
		while(!que.isEmpty()) {
			int[] temp = que.poll();
			for(int i=0;i<6;i++) {
				int nh = temp[0] + dh[i];
				int ny = temp[1] + dy[i];
				int nx = temp[2] + dx[i];
				if(nh>=0 && nh < H && ny >=0 && ny < N && nx>=0 && nx< M) {
					if(tomato[nh][ny][nx] != 0) continue;
					tomato[nh][ny][nx] = tomato[temp[0]][temp[1]][temp[2]] + 1;
					que.add(new int[] {nh, ny, nx});
				}
				
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(bf.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		tomato = new int[H][N][M];
		visited = new boolean[H][N][M];
		boolean checkTomato = false;
		
		for(int i=0;i<H;i++) {
			for(int j=0;j<N;j++) {
				st = new StringTokenizer(bf.readLine());
				for(int k=0;k<M;k++) {
					int toma = Integer.parseInt(st.nextToken());
					if(toma==0) checkTomato =true;
					tomato[i][j][k] = toma;
				}
			}
		}
		if(checkTomato) {
			BFS();
			int max = 0;
			boolean check=false;
			for(int i=0;i<H;i++) {
				for(int j=0;j<N;j++) {
					for(int k=0;k<M;k++) {
						if(tomato[i][j][k] > max) max = tomato[i][j][k];
						if(tomato[i][j][k] ==0) check=true;
					}
				}
			}
			if(!check) System.out.println(max-1);
			else System.out.println(-1);
		}
		else System.out.println(0);

		
		
	}

}
