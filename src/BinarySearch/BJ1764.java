package BinarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ1764 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[] n = new String[N];
		String[] m = new String[M];
		
		for(int i=0;i<N;i++) {
			n[i] = bf.readLine();
		}
		for(int i=0;i<M;i++) {
			m[i] = bf.readLine();
		}
		
		Arrays.sort(n);
		Arrays.sort(m);
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			String s = n[i];
			int low =  0;
			int high = m.length-1;
			while(low<=high) {
				int mid = (low + high) / 2;
				if(s.equals(m[mid])) {
					list.add(s);
					break;
				}
				else if(s.compareTo(m[mid]) <0) high = mid -1;
				else low = mid + 1;
			}
		}
		Collections.sort(list);
		for(String s : list) {
			bw.write(s + "\n");
		}
		bw.flush();
	}

}
