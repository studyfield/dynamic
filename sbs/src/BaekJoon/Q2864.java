package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2864 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		String maxA ="";
		String maxB ="";
		String minA ="";
		String minB ="";
		for(int i=0; i< a.length(); i++) {
			if(a.charAt(i)=='5' || a.charAt(i)=='6') {
				minA += "5";
				maxA += "6";
			}else {
				minA+=a.charAt(i);
				maxA+=a.charAt(i);
			}
		}
		for(int j=0; j<b.length(); j++) {
			if(b.charAt(j)=='5'||b.charAt(j)=='6') {
				minB+= "5";
				maxB+= "6";
			}else {
				minB+=b.charAt(j);
				maxB+=b.charAt(j);
			}
		}
		int min = Integer.parseInt(minA) + Integer.parseInt(minB);
		int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
		System.out.println(min+" "+max);
	}
}
