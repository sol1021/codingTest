package codingTest;
import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2869  {
	public static void main(String[] args) throws IOException  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a =  Integer.parseInt(st.nextToken());
		int b =  Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int result = 0;
		int n=0;
		result = (v-a) / (a-b) + 1;
		if((v-a) % (a-b) !=0) {
			result ++;
		}
		System.out.println(result);
	}

}
