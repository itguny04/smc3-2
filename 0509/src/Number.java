import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
        System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지): ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isExist = false; 
        
        for(int i=0;i<10;i++) {
        	if(((int)(Math.random()*50+1))==num) {
        		isExist = true;
        		break;
        	}
        }
        
        if(isExist) {
        	System.out.println("당첨! 일치하는 숫자가 있습니다.");
        } else {
        	System.out.println("꽝! 다음기회에~");
        }
        
        sc.close();
	}
}


