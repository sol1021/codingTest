package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ20546 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = n;
		int jh=0;
		int sm =0;
		String[] str = bf.readLine().split(" ");
		int[] arr = new int[str.length];
		for(int i=0;i<str.length;i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] <= n) {
				jh += n / arr[i];
				n -=  (n / arr[i]) * arr[i];
			}
		}
		
		for(int i=3;i<arr.length;i++) {
			if(arr[i] <= m) {
				if(arr[i-3] > arr[i-2] &&arr[i-2] > arr[i-1] && arr[i-1] > arr[i]) {
					sm += m / arr[i];
					m -= (m / arr[i]) * arr[i];
				}
			}
			if(sm > 0) {
				if(arr[i-3] < arr[i-2] && arr[i-2] < arr[i-1] && arr[i-1] < arr[i]) {
					m += sm * arr[i];
					sm = 0;
				}
			}
		}
		if(sm >0) sm = sm* arr[arr.length-1] + m;
		else sm = m;
		jh = jh * arr[arr.length-1] + n;
		
		if(sm > jh) System.out.println("TIMING");
		else if(sm < jh) System.out.println("BNP");
		else System.out.println("SAMESAME");
	}
}
