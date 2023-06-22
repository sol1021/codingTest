package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ10828 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int num = Integer.parseInt(st.nextToken());
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(bf.readLine());
			String s = st.nextToken();
			if(s.equals("push")) {
				int p = Integer.parseInt(st.nextToken());
				stack.push(p);
			}
			else if(s.equals("top")) {
				if(stack.empty())
					System.out.println(-1);
				else
					System.out.println(stack.peek());
			}
			else if(s.equals("size")) {
				int si= stack.size();
				System.out.println(si);
			}
			else if(s.equals("empty")) {
				if(stack.empty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(s.equals("pop")) {
				if(stack.empty())
					System.out.println(-1);
				else
					System.out.println(stack.pop());
					
			}
		}
	}

}
