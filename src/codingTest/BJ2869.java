package codingTest;
//아직 못품

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2869  {
	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(bf.readLine());
			int b = Integer.parseInt(bf.readLine());
			int v = Integer.parseInt(bf.readLine());
			int temp = 0;
			int result = 0;
			while(temp <=v) {
				result+=1;
				temp += a;
				if(temp >= v) break;
				else {
					temp-=b;
				}
			}
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
