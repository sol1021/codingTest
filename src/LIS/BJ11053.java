package LIS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11053 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] a = new int[A];
		for(int i=0;i<A;i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		int[] b = new int[A];
		int max = 0;
		
		for(int i=0;i<a.length;i++) {
			b[i] = 1;
			for(int j=0;j<i;j++) {
				if(a[i] > a[j]) {
					b[i] = Math.max(b[i], b[j]+1);
				}
				if(b[i] > max) max= b[i];
			}
		}
		System.out.println(max);
	}

}
