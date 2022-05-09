import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int first = sc.nextInt();
		System.out.print("마지막 숫자 : ");
		int last = sc.nextInt();
		
		System.out.println(first+"부터 "+last+"까지의 합은 "+((last-first+1)*(first+last))/2);
		
		sc.close();
	}

}
