package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ1325 {
	static int N, M;
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	static int[] result;
	static int count;
	
	static void DFS(int n) {
		visited[n] = true;
		for(int i=0;i<list[n].size();i++) {
			int m = list[n].get(i);
			if(visited[m]==false) {
				result[n]+=1;
				DFS(m);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N+1];
		visited = new boolean[N + 1];
		result = new int[N + 1];
		
		for(int i=1;i<=N;i++) {
			list[i] = new ArrayList<>();
		}
		for(int i=0;i<M;i++) {
			st= new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			list[m].add(n);
		}
		
		
		int[] result = new int[N+1];
		for(int i=1;i<=N;i++) {
				Arrays.fill(visited, false);
				DFS(i);				
		}
		int max = Arrays.stream(result).max().getAsInt();
		System.out.println(max);
		for(int i=1;i<result.length;i++) {
			if(result[i]==max) {
				System.out.print(i + " ");
			}
		}
		
	}

}
