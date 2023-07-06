package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ2644 {
	static int N, X, Y, M;
	static ArrayList<Integer> list[];
	static boolean[] visited;
	
	static int BFS(int x) {
		visited[x] = true;
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {x, 1});
		while(!que.isEmpty()) {
			int[] num =que.poll();
			for(int i=0;i<list[num[0]].size();i++) {
				int temp = list[num[0]].get(i);
				if(visited[temp]==false) {
					if(temp==Y) {
						return num[1];
					}
					que.add(new int[] {temp, num[1]+1});
					visited[temp] = true;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		M = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i=1;i<=N;i++) {
			list[i] = new ArrayList<>();
		}
		for(int i=0;i<M;i++) {
			st= new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list[x].add(y);
			list[y].add(x);
		}
		System.out.println(BFS(X));
	}
}
