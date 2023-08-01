package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ2606 {
	static ArrayList<Integer>[] list;
	static int N,M;
	static boolean[] visited;
	static int result;
	
	static void DFS(int num) {
		visited[num] = true;
		for(int i=0;i<list[num].size();i++) {
			int temp = list[num].get(i);
			if(!visited[temp]) {
				result++;
				visited[temp]=true;
				DFS(temp);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());
		M = Integer.parseInt(bf.readLine());
		list = new ArrayList[N+1];
		visited = new boolean[N+1];
		result=0;
				
		for(int i=1;i<=N;i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0;i<M;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			list[n].add(m);
			list[m].add(n);
		}
		
		for(int i=0;i<N;i++) {
			Collections.sort(list[i+1]);
		}
		
		DFS(1);
		System.out.println(result);
		
	}

}
