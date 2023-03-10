package 백준_B2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준_B2164 {
public static void main(String[] args) {
	Queue<Integer> q = new LinkedList<>();
	
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
//	int [] arr = new int[N];
	for (int i = 1; i <= N; i++) {
//		arr[i] = sc.nextInt();
		q.offer(i);
	}
	while(q.size()!=1) {
		q.poll();
		q.offer(q.poll());
	}
	System.out.println(q.poll());
}
}
