import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1000 ������ �ڿ����� �Է��ϼ���.");
		int a = sc.nextInt();
		a/=4;
		int sum = 0;
		
		for(int i=1;i<=a;i++) {
			sum+=i*4;
			System.out.println(i*4);
		}
		
		System.out.println("1~"+a+"���� 4�� ����� ���� "+sum+"�Դϴ�.");
		
	}

}
