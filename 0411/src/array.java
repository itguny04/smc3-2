import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int max;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+"번 입력 :");
			arr[i] = sc.nextInt();
		}
		
		max = 0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[max]<arr[i]) {
				max = i;
			}
		}
		
		System.out.println("가장 큰 수는 "+(max+1)+"번째 숫자인 "+arr[max]);
		

	}
}
