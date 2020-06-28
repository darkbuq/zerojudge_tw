
import java.util.Scanner;

public class A015 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			//String[] arrstr = sc.nextLine().split(" ");
			
			int row=sc.nextInt();
			int col=sc.nextInt();
			int[] i=new int[row*col];
			//System.out.println(i.length);
			
			//正常的矩陣
			for(int j=0;j<i.length;j++)  i[j]=sc.nextInt();
			
			for (int k=0; k<col; k++) {
				String str="";
				for (int t=0; t<row; t++) {
					str = str + i[k+(t*col)]+" ";
				}
				System.out.println(str);
				//System.out.println(i[k]+" "+i[k+col]);
			}
			
		}
	}

}
