package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ10773 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<num;i++) {
			String s = bf.readLine();
			if(s.equals("0")) 
				stack.pop();
			else
				stack.push(Integer.parseInt(s));
		}
		
		int result=0;
		while(!stack.empty()){
			result+= stack.pop();
		}
		System.out.println(result);
	}
}
