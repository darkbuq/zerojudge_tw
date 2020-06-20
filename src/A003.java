import java.util.Scanner;

public class A003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		
		while (sc.hasNext()) {
			str = sc.nextLine();
			String[] gg = str.split(" ");
			
			int i = ( Integer.parseInt(gg[0])*2 + Integer.parseInt(gg[1]) )%3;
			System.out.println(i);
		}
		sc.close();
	}

}
