
import java.util.Scanner;
import java.lang.Math;

public class A006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c,bb4ac;
		int ans1,ans2;
		String str;
		
		
		while (sc.hasNext()) {
			
			str = sc.nextLine();
			
			String[] strarr = str.split(" ");
			a = Integer.parseInt(strarr[0]);
			b = Integer.parseInt(strarr[1]);
			c = Integer.parseInt(strarr[2]);
			bb4ac = b*b-4*a*c;
			
			if (bb4ac<0) {
				System.out.println("No real root");
			} else if (bb4ac==0) {
				ans1 = (-b)/(2*a);
				System.out.println("Two same roots x="+ans1);
			} else {
				ans1 = (int)((-b)+Math.sqrt(bb4ac))/(2*a);
				ans2 = (int)((-b)-Math.sqrt(bb4ac))/(2*a);
				System.out.printf("Two different roots x1=%d , x2=%d",ans1,ans2);
				System.out.println();
			}
			
		}
	}

}
