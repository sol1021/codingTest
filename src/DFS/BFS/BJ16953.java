package DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ16953 {
	static Long A, B;
	
	static long BFS(long a) {
		Queue<long[]> que = new LinkedList<>();
		que.offer(new long[] {a,1});
		while(!que.isEmpty()) {
			long[] temp = que.poll();
			if(temp[0]==B) return temp[1];
			else {
				if(temp[0]*2 <= B) {
					que.offer(new long[] {temp[0]*2,temp[1]+1});
				}
				String s = Long.toString(temp[0]) + "1";
				if(Long.parseLong(s) <= B) {
					que.offer(new long[] {Long.parseLong(s),temp[1]+1});
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		A = Long.parseLong(st.nextToken());
		B = Long.parseLong(st.nextToken());
		System.out.println(BFS(A));
	}

}
