import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
        System.out.print("10���� ���� ���� �� �ϳ��� ���纸����(1~50����): ");

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
        	System.out.println("��÷! ��ġ�ϴ� ���ڰ� �ֽ��ϴ�.");
        } else {
        	System.out.println("��! ������ȸ��~");
        }
        
        sc.close();
	}
}


