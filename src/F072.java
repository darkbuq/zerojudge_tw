import java.util.Arrays;
import java.util.Scanner;

public class F072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			//System.out.println("共多少數字: "+sc.nextLine());
			String k = sc.nextLine();
			
			String[] arr = sc.nextLine().split(" ");
			
			//去頭
			String numstr="";
			int gg=0;
			for (String i:arr) {
				if(i.equals("0") & gg==0) {
					continue;
				} else if (i.equals("1") & gg==0) {
					gg=1;
					numstr = numstr + i;
				} else if (gg==1) {
					numstr = numstr + i;
				}	
			}
			System.out.println("去頭結果  "+numstr);
			
			//去尾
			String[] arr2 = numstr.split("");
			System.out.println(Arrays.toString(arr2));
			
			String numstr2="";
			gg=0;
			for (int i=(arr2.length-1);i>=0;i--) {
				//System.out.println("index "+i+"= "+arr2[i]);
				
				if(arr2[i].equals("0") & gg==0) {
					continue;
				} else if (arr2[i].equals("1") & gg==0) {
					gg=1;
					numstr2 = numstr2 + arr2[i];
				} else if (gg==1) {
					numstr2 = numstr2 + arr2[i];
				}
			}
			System.out.println("去尾結果  "+numstr2);
			
			//計算
			String[] arr3 = numstr2.split("1");
			System.out.println(Arrays.toString(arr3));
			System.out.println("length: "+arr3.length);
			
			int summ=0;
			for (String i:arr3) {
				char[] ch = i.toCharArray();
				
				int ff=0;
				for (char j:ch) {
					if (j=='0') {
						ff=ff+1;
					} else {
						ff=0;
						continue;
					}
				}
				
				summ = summ+ff;
			}
			System.out.println("ans: "+summ);
			
			
		}
	}

}
