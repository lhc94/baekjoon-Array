package array2562;

import java.util.Scanner;

// 백준 2562 최대값을 구하는 문제
// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//예를 들어, 서로 다른 9개의 자연수
//3, 29, 38, 12, 57, 74, 40, 85, 61
//이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
// 내가 생각한 것  
// int a = 9 이고  
// 만약 arr[j] 와 arr[j+1]을 비교해서 전자가 값이 크면  후자의 그 다음 값이랑 비교
// 반대로 후자가 크면 후자의 그 다음 값이랑 비교
// 문제점 : for문 안에 idx값을  유지 시킬 수가 없음
		
//		int cnt = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			for(int j = 0; j < arr.length - 1; j++) {
//				cnt++;
//				if(arr[j] > arr[j+1]) {
//					
//				}
//			}
//		}
		
// 처음 arr[0]부터 그 다음 값을 비교하면서 크면 idx값을 +1 시키고 아니면 그냥 넘기는 방식
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int index = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i+1;
			}
		}
		sc.close();
		System.out.println(max);
		System.out.println(index);
	}
}
