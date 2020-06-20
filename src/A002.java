import java.util.Scanner;

public class A002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		while(sc.hasNext()) {
			str = sc.nextLine();
			String[] gg = str.split(" ");
			
			int i = Integer.parseInt(gg[0]) + Integer.parseInt(gg[1]);
			System.out.println(i);
		}
		sc.close();
	}

}
