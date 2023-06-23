package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ1966 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int num = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(bf.readLine());
			int arrSize = Integer.parseInt(st.nextToken());
			int location = Integer.parseInt(st.nextToken());
			int[] originArr = new int[arrSize];
			st = new StringTokenizer(bf.readLine());
			for(int j=0;j<arrSize;j++) {
				int n = Integer.parseInt(st.nextToken());
				originArr[j] = n;
			}
			
			PriorityQueue<Integer> priorityQueue  = new PriorityQueue<>(Collections.reverseOrder());;
			Queue<Integer> queue = new LinkedList<Integer>();
			for(int j=0;j<arrSize;j++) {
				int n = originArr[j];
				queue.add(j);
				priorityQueue.add(n);
			}
			int result = 1;
			
			while(!queue.isEmpty()) {
				int queIndex = queue.poll();
				int arrValue = originArr[queIndex];
				int maxValue = priorityQueue.peek();
				
				if(arrValue == maxValue) {
					if(location==queIndex) {
						break;
					}
					else { 
						result++;
						priorityQueue.remove();
					}
				}
				else if(arrValue < maxValue) {
					queue.add(queIndex);
				}
			}
			 System.out.println(result);
		}
	}

}
