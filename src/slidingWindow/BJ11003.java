package slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11003 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());
		int[] arr = new int[N];
		int[] myArr = new int[N];
		int[] minArr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(i > 1) {
				minArr[i] = Math.min(arr[i], arr[i-1]);
			}
		}
		int min = arr[0];
		myArr[0] = arr[0];
		int idx = 0;
		int minNum = Integer.MAX_VALUE;
		for(int i=1;i<L;i++) {
			if(idx==0 && i>1 && minNum > minArr[i]) {
				minNum = minArr[i]; 
			}
			if(arr[i]< min) {
				min =arr[i];
				idx = i;
			}
			else {
				myArr[i] = min;
			}
		}
		System.out.println(minNum);
		for(int i=L;i<N;i++) {
			if(arr[i] < minNum) {
				myArr[i] = arr[i];
				minNum = arr[i];
			}
			else {
				myArr[i] = minNum;
			}
		}
		for(int i=0;i<N;i++) {
			System.out.print(myArr[i] + " ");
		}
	}

}
