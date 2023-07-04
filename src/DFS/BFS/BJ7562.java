package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ7562 {
	
	static int[] dx = {-2, -1, 1, 2, -2, -1, 1, 2};
	static int[] dy = {-1,- 2, -2, -1, 1, 2, 2, 1};
	static int N;
	static int[][] visited;
	
	static void BFS(int curY, int curX, int purY, int purX) {
		Queue<int[]> que = new LinkedList<>();
		visited[curY][curX] = 1;
		que.add(new int[] {curY, curX});
		while(!que.isEmpty()) {
			int[] tmp = que.poll();
			for(int i=0;i<dx.length;i++) {
				int y = tmp[0] + dy[i];
				int x = tmp[1] + dx[i];
				if(y>=0 && x >=0 && y < N && x < N) {
					if(visited[y][x]==0) {
						que.add(new int[] {y, x});
						visited[y][x] = visited[tmp[0]][tmp[1]]+1;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int num = Integer.parseInt(st.nextToken());
		for(int i=0;i<num;i++) {
			N = Integer.parseInt(bf.readLine());
			int[][] array = new int[N][N];
			visited = new int[N][N];
			
			st = new StringTokenizer(bf.readLine());
			int curY = Integer.parseInt(st.nextToken());
			int curX = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(bf.readLine());
			int purY = Integer.parseInt(st.nextToken());
			int purX = Integer.parseInt(st.nextToken());
			
			BFS(curY, curX, purY, purX);
			System.out.println(visited[purY][purX] -1);
		}
	}

}
