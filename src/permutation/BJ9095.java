package permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BJ9095 {
	static int N, T;
	static int count;
	static int[] arr;
	
	static void Permutation(int[] arr, int depth) {
		if(depth==N) {
			count++;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(depth<N)
				Permutation(arr,depth+arr[i]);
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(bf.readLine());
		arr = new int[]{1, 2, 3};
		
		for(int i=0;i<T;i++) {
			N=Integer.parseInt(bf.readLine());
			int depth=0;
			count=0;
			Permutation(arr, depth);
			System.out.println(count);
		}
	}

}
