package codingTest;

import java.util.Scanner;

public class BJ1712 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if(b<c) {
         int n = a / (c-b);
         System.out.println(n+1);
      }
      else
         System.out.println(-1);
      sc.close();
   }
}