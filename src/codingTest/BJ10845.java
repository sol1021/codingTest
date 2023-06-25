package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ10845 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int num = Integer.parseInt(st.nextToken());
		Queue<Integer> que = new LinkedList<>();
		int n=0;
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(bf.readLine());
			String s = st.nextToken();
			if(s.equals("push")) {
				n = Integer.parseInt(st.nextToken());
				que.add(n);
			}
			else if(s.equals("pop"))
				if(que.isEmpty())
					System.out.println(-1);
				else
					System.out.println(que.poll());
			else if(s.equals("size"))
				System.out.println(que.size());
			else if(s.equals("empty")) {
				if(que.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(s.equals("front")) {
				if(que.isEmpty())
					System.out.println(-1);
				else
					System.out.println(que.peek());
			}
			else if(s.equals("back"))
				if(que.isEmpty())
					System.out.println(-1);
				else
					System.out.println(n);
				
		}
	}

}
