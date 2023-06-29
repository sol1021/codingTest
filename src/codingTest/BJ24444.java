package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ24444 {
	static int N, M, R;
	static int[] visited;
	static int count;
	static ArrayList<Integer>[] list;
	
	static void BFS(int r) {
		Queue<Integer> que = new LinkedList<>();
		visited[r] = ++count;
		que.add(r);
		while(!que.isEmpty()) {	
			int n =que.poll();
			for(int i=0;i<list[n].size();i++) {
				int num = list[n].get(i);
				if(visited[num] ==0) {
					visited[num] = ++count;
					que.add(num);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		list = new ArrayList[N+1];
		visited = new int[N+1];
		for(int i=1;i<=N;i++) {
			list[i] = new ArrayList<>();
		}
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			list[n].add(m);
			list[m].add(n);
		}
		for(int i=1;i<=N;i++) {
			Collections.sort(list[i]);
		}
		count=0;
		BFS(R);
		for(int i=1;i<N+1;i++) {
			System.out.println(visited[i]);
		}
		
		
	}

}
