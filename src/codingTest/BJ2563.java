package codingTest;

import java.util.Scanner;

public class BJ2563 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int result = 0;
      int[][] array2 = new int[100][100];
      for(int m=0;m<n;m++) {
         int x  = sc.nextInt();
         int y = sc.nextInt();
         for(int i=x;i<x+10;i++) {
            if(i>100) break; 
            for(int j=y;j<y+10;j++) {
               if(j>100) break;
               if(array2[i][j]!=1)
                  array2[i][j]=1;
            }
         }
      }
      for(int i=0;i<100;i++) {
         for(int j=0;j<100;j++) {
            if(array2[i][j]==1)
               result+=1;
         }
      }
      System.out.println(result);
      sc.close();
   }
}