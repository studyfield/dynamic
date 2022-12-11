package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Q10825 {

	public static void main(String[] args) throws IOException {
		
		// 입출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 총 학생수
		int n = Integer.parseInt(br.readLine());
		Student[] students = new Student[n];
		
		// 입력받은 학생 수만큼의 이름,국,영,수 값을 입력받을 배열 생성
		for(int i=0; i<n; i++) {
			String[] score = br.readLine().split(" ");
			students[i] = new Student(score[0], Integer.parseInt(score[1]),Integer.parseInt(score[2]),
					Integer.parseInt(score[3]));
		}
		// 조건 비교
		Comparator<Student> mycom = new Comparator<Student>() {
			@Override
			public int compare(Student o1,Student o2) {
				if(o1.korean < o2.korean) {
					return 1;
				}else if(o1.korean == o2.korean) {
					if(o1.english > o2.english) {
						return 1;
					}else if(o1.english == o2.english) {
						if(o1.math < o2.math) {
							return 1;
						}else if(o1.math == o2.math) {
							return o1.name.compareTo(o2.name);
						}
					}
				}
				return -1;
			} 
		}; 
		// 정렬 후 출력
		Arrays.sort(students, mycom);
		for (int i=0; i<n; i++) {
			bw.write(students[i].name +"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
	class Student {
		String name;
		int korean;
		int english;
		int math;

		Student(String name, int korean, int english, int math) {
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
		}
	}
