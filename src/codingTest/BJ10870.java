package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10870 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int tmp =0;
		int[] array = new int[num];
		
		System.out.println(fibo(tmp, num ,array));
		
	}
	public static int fibo(int sum, int num,int[] array) {
		if(sum==num) {
			if(num==0) return 0;
			else if(num==1) return 1;
			else if(num>1) {
				int result = array[num-2] + array[num-1]; 
				return result;
			}
		}
		if(sum>1) {
			array[sum] = array[sum-1]+ array[sum-2];
		}else 
			array[sum] = sum;
		return fibo(++sum,num,array);
	}
}
 