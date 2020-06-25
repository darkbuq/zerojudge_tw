import java.util.Scanner;

public class A009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String txt,txtok="";
		char[] chrCharArray;
		
		
		while (sc.hasNext()) {
			txt = sc.nextLine();
			//System.out.println(txt);
			
			chrCharArray = txt.toCharArray();
			//System.out.println(chrCharArray[5]);
			
			for (char i:chrCharArray) {
				txtok +=  (char)( ((int)i)-7 );
			}
			
			System.out.println(txtok);
		}
	}

}
