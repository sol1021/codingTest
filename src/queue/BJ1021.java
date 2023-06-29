package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BJ1021 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] array = new int[m];
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<m;i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		Deque<Integer> deq = new ArrayDeque<>();
		for(int i=1;i<=n;i++) {
			deq.add(i);
		}
		int count=0;
		int result=0;

		for(int i=0;i<m;i++) {
			int num = array[i];
			int first = deq.peek();
			first = Math.abs(first-num);
			int last = deq.peekLast();
			if(last-num <0)
				last = n-num+last;
			else last = last-num;
			if(deq.peek()==num) {
				deq.poll();
				continue;
			}
			System.out.println("@@@"+first + " " + last);
			if(first < last) {
				while(deq.peek()!=num) {
					int r = deq.remove();
					deq.add(r);
					result++;
					System.out.println("first" + r);
				}
				deq.poll();
			}
			else {
				while(deq.peek()!=num) {
					int r = deq.removeLast();
					deq.addFirst(r);
					result++;
					System.out.println("last" + r);
				}
				deq.poll();
			}
			n--;
		}
		System.out.println(result);
		System.out.println(n);
	}

}
