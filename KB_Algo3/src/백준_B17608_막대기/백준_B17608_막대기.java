package 백준_B17608_막대기;

import java.util.Scanner;

public class 백준_B17608_막대기 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 막대기 개수
		int [] arr = new int[a]; //입력값을 담을 배열
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
	
		}
		int cnt = 1; // 시행횟수 + 마지막 막대기는 무조건 보이기 떄문에
		int end = arr[a-1]; // 마지막 앞 배열 
		
		for (int i = arr.length-1; i >= 0; i--) {
			if(end < arr[i]) { //마지막 앞 배열이 마지막보다 크다면
				end = arr[i]; //마지막 앞 배열을 교체하고 카운트 늘림
				cnt++;
				}
		}
		System.out.println(cnt);
	} // end main
}	

