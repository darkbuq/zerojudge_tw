import java.util.Arrays;
import java.util.Scanner;

public class B294 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int day=Integer.parseInt(sc.nextLine());
			//System.out.println(day);
			
			String[] arrstr = sc.nextLine().split(" ");
			//System.out.println(Arrays.toString(arrstr));
			
			int summ=0;
			for (int i=1; i<=day; i++) {
				summ=summ+(i*Integer.parseInt(arrstr[i-1]));
			}
			System.out.println(summ);
		}
	}

}
