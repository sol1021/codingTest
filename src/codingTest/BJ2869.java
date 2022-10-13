package codingTest;
import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;
//시간초과
public class BJ2869  {
	public static void main(String[] args) throws IOException  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a =  Integer.parseInt(bf.readLine());
		int b =  Integer.parseInt(bf.readLine());
		int v = Integer.parseInt(bf.readLine());
		int sum =0;
		int result =0;
		while(sum<=v) {
			result++;
			sum+=a;
			if(sum>=v) break;
			sum-=b;
		}
		System.out.println(result);
	}

}
