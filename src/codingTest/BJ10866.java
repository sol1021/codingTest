package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BJ10866 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(bf.readLine());
			String s = st.nextToken();
			if(s.equals("push_front")) {
				int m = Integer.parseInt(st.nextToken());
				deque.addFirst(m);
			}
			else if(s.equals("push_back")) {
				int m = Integer.parseInt(st.nextToken());
				deque.addLast(m);
			}
			else if(s.equals("pop_front")) {
				if(!deque.isEmpty())
					System.out.println(deque.removeFirst());
				else
					System.out.println(-1);
			}
			else if(s.equals("pop_back")) {
				if(!deque.isEmpty())
					System.out.println(deque.removeLast());
				else
					System.out.println(-1);
			}
			else if(s.equals("size"))
				System.out.println(deque.size());
			else if(s.equals("empty")) {
				if(deque.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(s.equals("front")) {
				if(!deque.isEmpty())
					System.out.println(deque.peekFirst());
				else System.out.println(-1);
			}
			else if(s.equals("back")) {
				if(!deque.isEmpty())
					System.out.println(deque.peekLast());
				else System.out.println(-1);
			}
		}
	}
}
