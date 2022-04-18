import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		int sum;
		
		System.out.print("시작 숫자: ");
		a = sc.nextInt();
		System.out.print("마지막 숫자: ");
		b = sc.nextInt();
		
		sum = ((b-a+1)*(a+b))/2;
		
		System.out.println(a+"부터 "+b+"까지의 합은 "+sum+"입니다." );
		
		sc.close();
		
	}

}
