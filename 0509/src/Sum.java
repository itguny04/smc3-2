import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int first = sc.nextInt();
		System.out.print("������ ���� : ");
		int last = sc.nextInt();
		
		System.out.println(first+"���� "+last+"������ ���� "+((last-first+1)*(first+last))/2);
		
		sc.close();
	}

}
