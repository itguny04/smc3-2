import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		int sum;
		
		System.out.print("���� ����: ");
		a = sc.nextInt();
		System.out.print("������ ����: ");
		b = sc.nextInt();
		
		sum = ((b-a+1)*(a+b))/2;
		
		System.out.println(a+"���� "+b+"������ ���� "+sum+"�Դϴ�." );
		
		sc.close();
		
	}

}
