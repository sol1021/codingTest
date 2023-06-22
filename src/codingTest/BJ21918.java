package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ21918 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(bf.readLine());
			int num = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(num==1) {
				arr[a-1] = b;
			}
			else if(num ==2) {
				for(int j=a-1;j<b;j++) {
					if(arr[j]==1) arr[j] = 0;
					else arr[j] = 1;
				}
			}
			else if(num==3) {
				for(int j=a-1;j<b;j++) {
					arr[j] =0;
				}
			}
			else if(num==4) {
				for(int j=a-1;j<b;j++) {
					arr[j] =1;
				}
			}
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}
