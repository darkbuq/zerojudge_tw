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
			//System.out.println(i);
			
			if (i==0) {
				System.out.println("���q");
			} else if (i==1) {
				System.out.println("�N");
			} else {
				System.out.println("�j�N");
			}
		}
		sc.close();
	}

}
