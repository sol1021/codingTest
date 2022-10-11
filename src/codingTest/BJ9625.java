package codingTest;
//메모리 초과
import java.util.Scanner;

public class BJ9625 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		StringBuilder sb = new StringBuilder();
		int num = sc.nextInt();
		int a = 0;
		int b = 0;
		String even = "";
		String odd = "";
		if(num ==0) {
			sb.append("A");
		}
		for(int i=1;i<=num;i++) {
			
			if(i ==1) {
				sb.append("B");
				odd = sb.toString();
			}
			else if(i==2) {
				sb.append("A");
				even = sb.toString();
			}
			else if(i%2!=0) {
				sb.append(odd);
				odd = sb.toString();
			}
			else if(i%2==0) {
				sb.append(even);
				even = sb.toString();
			}
		}
		String str = sb.toString();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A')
				a += 1;
			else b+=1;
		}
		System.out.println(a +" "+ b);
		sc.close();
	}
}
