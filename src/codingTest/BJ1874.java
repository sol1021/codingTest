package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ1874 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int[] array = new int[num];
		
		for(int i=0;i<num;i++) {
			int n = Integer.parseInt(bf.readLine());
			array[i] = n;
		}
		StringBuilder s = new StringBuilder();
		int count=0;
		boolean check=false;
		Stack<Integer> stack = new Stack<>();
		for(int i=1;i<=num;i++) {
			stack.push(i);
			s.append("+");
			if(!stack.isEmpty()) {
				while(true) {
						if(!stack.isEmpty() && stack.peek()==array[count]) {
							s.append("-");
							stack.pop();
							count++;
						}
					else {
						if(count == num) check=true;
						break;
					}
				}
			}
		}
		if(check) {
			for(int i=0;i<s.length();i++) {
				System.out.println(s.charAt(i));
			}
		}
		else System.out.println("NO");
	}

}
