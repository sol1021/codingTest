package codingTest;

import java.util.Scanner;

public class BJ2869_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//보이는 그대로 코드를 작성하니 시간 초과에 걸렸다.
		//정상에 올라간 후에는 미끄러지지 않은다는 것을 염두하고 응용한 코드
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		//v / (a -b) 이렇게 코드를 짜게 되면 정상에 올라간후에 미끄러지지 않는다는 조건을 충족하지 못한다.
		//따라서 아래와같이 코드를 작성해야 한다.
		int result =(a-b) / (v-b);
		System.out.println(result);
		sc.close();
	}

}
