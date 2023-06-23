package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ2164 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		Queue<Integer> que = new LinkedList<>();
		for(int i=1;i<=num;i++) {
			que.add(i);
		}
		while(true) {
			if(que.size()==1) break;
			que.remove();
			int n = que.poll();
			que.add(n);
		}
		System.out.println(que.poll());
	}
}
