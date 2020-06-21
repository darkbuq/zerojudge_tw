import java.util.Scanner;

public class A005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int num = Integer.parseInt(sc.nextLine());
			//System.out.println("num= "+num);
			
			String numl;
			for (int i = 0; i<num; i++) {
				//System.out.println("i= "+i);
				numl=sc.nextLine();
				String[] numarr1 = numl.split(" ");
				System.out.println(numarr1[2]);
				//int[] numarr2 = new int[4];
				
			}
			
		}
	}

}
