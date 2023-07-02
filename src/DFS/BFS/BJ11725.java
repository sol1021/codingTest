package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ11725 {
	static ArrayList<Integer>[] list;
	static int[] visited;
	static int N;
	
	static void DFS(int n) {
		for(int i=0;i<list[n].size();i++) {
			int num = list[n].get(i);
			if(visited[num]==0) {
				visited[num] = n;
				DFS(num);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		list = new ArrayList[N+1];
		visited = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=1;i<N;i++) {
			st = new StringTokenizer(bf.readLine());
			int n= Integer.parseInt(st.nextToken());
			int m= Integer.parseInt(st.nextToken());
			list[n].add(m);
			list[m].add(n);
		}
		DFS(1);
		for(int i=2;i<visited.length;i++) {
			System.out.println(visited[i]);
		}
		
	}

}
