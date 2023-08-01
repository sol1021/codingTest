package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class BJ10816 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(map.containsKey(temp)) map.put(temp, map.get(temp)+1);
			else map.put(temp, 1);
		}
		
		List<Integer> keySet = new ArrayList<>(map.keySet());
		Collections.sort(keySet);
		
		int M = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<M;i++) {
			int x = Integer.parseInt(st.nextToken());
			int low = 0;
			int high = keySet.size()-1;
			int result =0;
			while(low<=high) {
				int mid = (low + high) / 2;
				if(x==keySet.get(mid)) {
					result = map.get(keySet.get(mid));
					break;
				}
				else if(x <  keySet.get(mid)) {
					high = mid -1;
				}
				else low = mid +1;
			}
			bw.write(result+ " ");
		}
		bw.flush();
	}
}