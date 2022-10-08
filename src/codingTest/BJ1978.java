package codingTest;

import java.util.Scanner;

public class BJ1978 {
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      int result =0;
	      
	      for(int i=0;i<num;i++) {
	         boolean isPrime =true;
	         int primeNum = sc.nextInt();
	         if(primeNum==1) continue;
	         for(int j=2;j<primeNum;j++) {
	            if(primeNum%j==0) {
	               isPrime=false;
	               break;
	            }
	         }
	         if(isPrime) result++;
	      }
	      System.out.println(result);
	   }
}
