
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		
		while (sc.hasNext()) {
			str = sc.nextLine();
			
			int strint = Integer.parseInt(str);//�r������
			//System.out.println("strint: "+strint);
			
			List listt = new ArrayList(); //���@�� �]�l�C
			List listunique = new ArrayList(); //���@�� �]�l�C �����@�C
			
			while (true) {
				int g=0;
				for (int i=2;i<=Math.sqrt(strint);i++) {
					//System.out.println(i);
					if (strint % i == 0) {
						g++;
					}
				}
				//System.out.println("g= "+g);
				if (g==0) {
					listt.add(new Integer(strint));
					
					if(!listunique.contains(strint))  listunique.add(new Integer(strint));
					
					break;
				}
				
				for (int j=1;j<=Math.sqrt(strint);j++) {
					//System.out.println("j= "+j);
					if (strint % j == 0 & j!=1) {
						listt.add(new Integer(j));
						strint = strint/j;
						//System.out.println("�]�l= "+j);
						//System.out.println("strint= "+strint);
						
						if(!listunique.contains(j))  listunique.add(new Integer(j));
						
						break;
					}
				}
			}		
			//System.out.println("ArrayList: "+listt);
			//System.out.println("listunique: "+listunique);
			
			/*
			System.out.println( listunique.get(1) );
			//�p��List���Y�Ӥ����X�{������
			System.out.println(Collections.frequency(listt, listunique.get(1)));
			*/
			
			String ans="";
			if (( Collections.frequency(listt, listunique.get(0))==1 )) {
				ans=""+listunique.get(0);
			} else {
				ans=listunique.get(0)+"^"+
						Collections.frequency(listt, listunique.get(0));
			}
			
			for (int k=1; k < listunique.size(); k++) {
								
				if ( Collections.frequency(listt, listunique.get(k))==1 ) {
					ans = ans+" * "+listunique.get(k);
				} else {
					ans = ans+" * "+listunique.get(k)+"^"+
				Collections.frequency(listt, listunique.get(k));
				}
				
				//ans = ans+" * "+listunique.get(k);
				//System.out.println(ans);
			}
			System.out.println(ans);
		}
	}

}
