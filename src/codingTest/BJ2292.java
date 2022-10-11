package codingTest;

import java.util.Scanner;

public class BJ2292 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i =1;
      int sum =1;
      while(n>sum) {
         sum += i * 6;
         i++;
      }
      sc.close();
      System.out.println(i);
   }
}