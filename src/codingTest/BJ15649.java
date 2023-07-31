package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15649 {
	static int N, M;
	static boolean[] visited;
	static void Permutation(int depth, boolean[] visited, int[] arr) {
		if(depth==M) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
			return;
		}
		for(int i=1;i<=N;i++) {
			if(!visited[i]) {
				visited[i]= true;
				arr[depth] = i;
				Permutation(depth+1, visited, arr);
				visited[i] = false;
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N+1];
		int[] arr= new int[M];
		Permutation(0, visited, arr);
	}
	

}
