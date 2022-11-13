package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10872 {
   public static void main(String[] args) throws IOException{
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(bf.readLine());
      int num = Integer.parseInt(st.nextToken());
      int sum =1;
      System.out.println(factorial(num, sum));
      bf.close();
      
   }
   public static int factorial(int n, int sum) {
      if(n==1 || n==0) return sum;
      sum *= n;
      return factorial(--n,sum);
   }
}