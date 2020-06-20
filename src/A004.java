import java.util.Scanner;

public class A004 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		String str="";
		String stri=sc.nextLine();
		//System.out.println(stri);
		int inum;
		
		while (!stri.equals("EOF")) {
			
			inum = Integer.parseInt(stri);
			
			if ( (inum % 400) == 0 ) {
				str =str + "閏年 ";
			} else if ( (inum % 4) == 0 &  (inum % 100) != 0 ) {
				str =str + "閏年 ";
			} else {
				str =str + "平年 ";
			}
								
			stri=sc.nextLine();
									
		}
				
		String[] gg = str.split(" ");
		
		for (String i : gg) {
			System.out.println(i);
		}
		*/
		
		Scanner cin = new Scanner(System.in);
        int N;
        while(cin.hasNextInt()) {
            N = cin.nextInt();
            if(N%4 == 0 && N%100 != 0 || N%400 == 0)
                System.out.println("閏年");
            else
                System.out.println("平年");
        }
        
	}

}
