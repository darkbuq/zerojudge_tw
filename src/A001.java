
import java.util.Scanner;

public class A001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入三個數字(以空白鍵分開)：");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        System.out.println("您輸入第一個數字為：" + num1 );
        System.out.println("您輸入第二個數字為：" + num2 );
        System.out.println("您輸入第三個數字為：" + num3 );
        */
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String str = sc.next();
			System.out.println("hello, "+ str);
		}
	}
}
