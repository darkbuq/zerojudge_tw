import java.util.Scanner;

public class F043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int r,a,num;
		while (sc.hasNext()) {
			String[] arr = sc.nextLine().split(" ");
			r = Integer.parseInt(arr[0]);
			a = Integer.parseInt(arr[1]);
			
			if (r == a) a=a-3;
			
			num = r-a;
			
			if (num<a) {
				System.out.println(num+"+"+a+"="+r);
			} else {
				System.out.println(a+"+"+num+"="+r);
			}
		}
	}
}
