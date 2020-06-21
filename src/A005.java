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
				
				numl=sc.nextLine();
				String[] numarr1 = numl.split(" ");
				
				int a1 = Integer.parseInt(numarr1[0]);
				int a2 = Integer.parseInt(numarr1[1]);
				int a3 = Integer.parseInt(numarr1[2]);
				int a4 = Integer.parseInt(numarr1[3]);
				
				if ( (a2-a1)==(a3-a2) ) {
					int a5 = a4+(a3-a2);
					numl=numl+" "+a5;
					System.out.println(numl);
				} else {
					int a5 = a4*(a3/a2);
					numl=numl+" "+a5;
					System.out.println(numl);
				}
				
			}
			
		}
	}

}
