package codingTest;

import java.util.Scanner;

public class BJ2525 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int oven = sc.nextInt();
		int resultMin = min + oven;
		
		if(resultMin >= 60) {
			hour += (int)resultMin / 60;
			resultMin %= 60;
		}
		if(hour >= 24) hour %= 24;
		
		System.out.println(hour+" "+resultMin);
		sc.close();
	}

}
