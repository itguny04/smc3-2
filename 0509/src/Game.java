import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = {"가위","바위","보"};
		
		System.out.println("가위 바위 보!");
		String user = sc.next();
		String computer = arr[(int)(Math.random()*3)]; 
		
		if(user.equals("가위")) {
			if(computer.equals("바위")) {
				System.out.println("바위\n졌다!");
			} else if(computer.equals("가위")) {
				System.out.println("가위\n비겼다!");
			} else {
				System.out.println("보\n이겼다.!");
			} 
		} else if(user.equals("바위")) {
			if(computer.equals("보")) {
				System.out.println("보\n졌다!");
			} else if(computer.equals("바위")) {
				System.out.println("바위\n비겼다!");
			} else {
				System.out.println("가위\n이겼다.!");
			} 
		} else {
			if(computer.equals("가위")) {
				System.out.println("가위\n졌다!");
			} else if(computer.equals("보")) {
				System.out.println("보\n비겼다!");
			} else {
				System.out.println("바위\n이겼다!");
			} 
		}
		
		sc.close();
	}
}