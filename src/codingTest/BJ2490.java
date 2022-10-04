package codingTest;

import java.util.Scanner;

public class BJ2490 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[4];
		String[] a = new String[3];
		
		for(int i=0;i<3;i++) {
			int sum=0;
			for(int j=0;j<array.length;j++) {
				array[i] = sc.nextInt();
				if(array[i]==0) sum+=1;
				switch(sum) {
				case 4:
					a[i] = "D";
					break;
				case 3:
					a[i] ="C";
					break;
				case 2:
					a[i] ="B";
					break;
				case 1:
					a[i] ="A";
					break;
				default:
					a[i] ="E";
				}
			}
		}
		for(int i=0;i<3;i++) System.out.println(a[i]);
		sc.close();
	}
}
