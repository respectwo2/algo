package 백준_B1158;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준_B1158 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		for (int i = 1; i <  N+1; i++) { 
			q.offer(i);	//Queue 에 1~N까지 값을 offer
//			q.add(i);
		}
		while(q.size()>1) { //Queue가 사이즈가 1이 될떄까지 반복
			for (int i = 1; i < K; i++) {
				q.offer(q.poll());
				//K-1번재까지는 처음에 있었던 값을 맨 뒤로 보냄
//				q.add(q.poll());
			}
			System.out.printf("%d,",q.poll());
		}
		System.out.printf("%d\n",q.poll());
	}
}

