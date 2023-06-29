package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ11724 {
	static int N, M;
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	
	static void DFS(int r) {
		visited[r] = true;
		for(int i=0;i<list[r].size();i++) {
			int num = list[r].get(i);
			if(!visited[num]) {
				visited[num] = true;
				DFS(num);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M= Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N+1];
		visited = new boolean[N+1];
		for(int i=1;i<=N;i++) {
			list[i] = new ArrayList<>();
		}
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(bf.readLine());
			int n= Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			list[n].add(m);
			list[m].add(n);
		}
		int count=0;
		for(int i=1;i<visited.length;i++) {
			if(!visited[i]) {
				DFS(i);
				count++;
			}
		}
		System.out.println(count);
		
	}

}
