package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
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
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			list.add(i);
		}
		int answer=0;
		int index = 0;
		for(int i=0;i<m;i++) {
			int num = array[i];
			index = list.indexOf(num);
			if(list.size() / 2 + list.size()%2 >=index+1) {
				while(list.get(0)!=num) {
					int r =list.remove(0);
					list.add(r);
					answer++;
				}
				list.remove(0);
			}
			else {
				while(list.get(0)!=num) {
					int r =list.remove(list.size()-1);
					list.add(0, r);
					answer++;
				}
				list.remove(0);
			}
		}
		System.out.println(answer);
	}

}
