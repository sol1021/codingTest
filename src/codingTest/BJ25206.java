package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ25206 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		double n =0.0;
		double m =0.0;
		for(int i=0;i<20;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String s = st.nextToken();
			double grade = Double.parseDouble(st.nextToken());
			String stringGrade = st.nextToken();
			if(stringGrade.equals("A+")) { 
				n += grade * 4.5;
				m+=grade;
			}
			else if(stringGrade.equals("A0")) { 
				n += grade * 4.0;
				m+=grade;
			}
			else if(stringGrade.equals("B+")) { 
				n += grade * 3.5;
				m+=grade;
			}
			else if(stringGrade.equals("B0")) { 
				n += grade * 3.0;
				m+=grade;
			}
			else if(stringGrade.equals("C+")) { 
				n += grade * 2.5;
				m+=grade;
			}
			else if(stringGrade.equals("C0")) { 
				n += grade * 2.0;
				m+=grade;
			}
			else if(stringGrade.equals("D+")) { 
				n += grade * 1.5;
				m+=grade;
			}
			else if(stringGrade.equals("D0")) { 
				n += grade * 1.0;
				m+=grade;
			}
			else if(stringGrade.equals("F")) { 
				n += grade * 0.0;
				m+=grade;
			}
			else
				continue;
		}
		System.out.println(String.format("%.6f",n/m));
	}

}
