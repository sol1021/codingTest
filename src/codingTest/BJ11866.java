package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ11866 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Queue<Integer> que = new LinkedList<>();
		System.out.println(n);
		for(int i=1;i<=n;i++) {
			que.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		int count=1;
		while(!que.isEmpty()) {
			if(count != m) {
				que.add(que.poll());
				count++;
			}
			else if(count==m) {
				if(que.size()==1){
					sb.append(que.poll());
					sb.append(">");
				}
				else {
					sb.append(que.poll());
					sb.append(", ");
					count=1;
				}
			}
				
		}
		System.out.println(sb);
	}

}
