import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int max;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+"�� �Է� :");
			arr[i] = sc.nextInt();
		}
		
		max = 0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[max]<arr[i]) {
				max = i;
			}
		}
		
		System.out.println("���� ū ���� "+(max+1)+"��° ������ "+arr[max]);
		

	}
}
