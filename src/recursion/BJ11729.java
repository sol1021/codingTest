package recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ11729 {
	static int n;
	static int count;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	static void move(int n, int start, int to) throws IOException {
		bw.write(start + " "+ to+"\n");
	}
	
	static void hanoi(int n, int start, int to, int via) throws IOException {
		if(n==1) {
			move(1,start,to);
		}
		else {
			hanoi(n-1,start, via,to);
			move(n,start,to);
			hanoi(n-1,via,to,start);
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(bf.readLine());
		bw.write((int)Math.pow(2, n)-1 + "\n");
		hanoi(n, 1,3,2);
		bw.flush();
		
	}
}
