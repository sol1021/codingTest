package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ24479 {
	static int N, M, R;
	static ArrayList<Integer> list[];
	static int[] visited;
	static int count;

	static void DFS(int r) {
		visited[r] = count++;
		for (int i = 0; i < list[r].size(); i++) {
			int num = list[r].get(i);
			if (visited[num]==0) {
				DFS(num);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		list = new ArrayList[N + 1];
		visited = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}
		for (int i = 0; i <M; i++) {
			st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			list[n].add(m);
			list[m].add(n);
		}
		for (int i = 1; i <= N; i++) {
			Collections.sort(list[i]);
		}
		count =1;
		DFS(R);
		for (int i = 1; i <= N; i++) {
			System.out.println(visited[i]);
		}
	}
}
