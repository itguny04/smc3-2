import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = {"����","����","��"};
		
		System.out.println("���� ���� ��!");
		String user = sc.next();
		String computer = arr[(int)(Math.random()*3)]; 
		
		if(user.equals("����")) {
			if(computer.equals("����")) {
				System.out.println("����\n����!");
			} else if(computer.equals("����")) {
				System.out.println("����\n����!");
			} else {
				System.out.println("��\n�̰��.!");
			} 
		} else if(user.equals("����")) {
			if(computer.equals("��")) {
				System.out.println("��\n����!");
			} else if(computer.equals("����")) {
				System.out.println("����\n����!");
			} else {
				System.out.println("����\n�̰��.!");
			} 
		} else {
			if(computer.equals("����")) {
				System.out.println("����\n����!");
			} else if(computer.equals("��")) {
				System.out.println("��\n����!");
			} else {
				System.out.println("����\n�̰��!");
			} 
		}
		
		sc.close();
	}
}