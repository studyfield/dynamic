package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 재귀 함수: 재귀함수는 함수가 자기 자신의 함수를 재참조 하는 방법  (피보나치,팩토리얼)
public class Q10870 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n =Integer.parseInt(br.readLine());	// 입력받은 br.readLine()은 String형이므로 int형으로 변환
		
		System.out.println(fibo(n));
	}
	//  static의 경우 객체 생성 없이 클래스를 통해 메서드를 직접 호출할 수 있는 장점이 있다
		static int fibo(int n) {
			if(n==0) return 0;
			if(n==1) return 1;
			
			return fibo(n-1)+fibo(n-2);
		}
	}
