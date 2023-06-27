package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ1260 {
	static int N, M, V;
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	
	static void DFS(int v) {
		visited[v] = true;
		System.out.print(v + " ");
		for(int i=0;i<list[v].size();i++) {
			int num = list[v].get(i);
			if(!visited[num]) {
				DFS(num);
			}
		}
	}
	
	static void BFS(int v) {
		Queue<Integer> que = new LinkedList<>();
		visited[v] = true;
		que.offer(v);
		while(!que.isEmpty()) {
			int num = que.poll();
			System.out.print(num + " ");
			for(int i=0;i<list[num].size();i++) {
				int listNum = list[num].get(i);
				if(!visited[listNum]) {
					visited[listNum] = true;
					que.add(listNum);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		list = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i=1;i<=N;i++) {
			list[i] = new ArrayList<>();
		}
		for(int i=0;i<M;i++) {
			st= new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			list[n].add(m);
			list[m].add(n);
		}
		for(int i=1;i<=N;i++) {
			Collections.sort(list[i]);
		}
		
		DFS(V);
		Arrays.fill(visited, false);
		System.out.println();
		BFS(V);
		
		
	}

}
