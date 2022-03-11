package array10818;

import java.util.Arrays;
import java.util.Scanner;

// 백준 10818번 1차원배열문제
// 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
// 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

// 변수 a 값를 입력하면 그 값에 대한 배열 갯수가 정해지고 
// 그중에 최소값과 최대값을 구해야함

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("arr.length : ");
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//첫번쨰와 두번쨰를 비교 둘중에 큰건 앞으로 작은건 뒤로
		
//		for(int j = 0; j < arr.length - 1; j++) {
//			if(arr[j] > arr[j+1]) {
//				int tmp;
//				tmp = arr[j];
//				arr[j] = arr[j+1];
//				arr[j+1] = tmp;
//			}
//		}
//		이부분을 Arrays.sort()로 해결 가능 하다
		
		Arrays.sort(arr);
		System.out.println("최소값 : " + arr[0] + "최대값 : " + arr[a]);
		sc.close();
	}
}
