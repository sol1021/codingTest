package permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10974 {
	static int N;
	static int[] arr;
	static boolean[] visited;
	static void Permutation(int depth) {
		if(depth==N) {
			for(int x : arr) {
				System.out.print(x+ " ");
			}
			System.out.println();
		}
		for(int i=1;i<=N;i++) {
			if(visited[i]==false) {
				visited[i]=true;
				arr[depth] = i;
				Permutation(depth+1);
				visited[i] = false;
			}
			
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());
		arr = new int[N];
		visited = new boolean[N+1];
		Permutation(0);
	}
}
