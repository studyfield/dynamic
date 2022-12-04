import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 사람의 수
		
		int[] arr = new int[N];	// 인출 시간 배열
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();	// 인출 시간 배열 입력
		}
		
		// 정렬 
		Arrays.sort(arr);
 
		int total_time = 0;	// 사람별 대기시간 총합 
		int wait_time = 0;	// 이전까지의 대기시간 누적합 
				
		for(int i = 0; i < N; i++) {	
			wait_time += arr[i];
		    total_time += wait_time; 
		}
		System.out.println(total_time);
	}
}