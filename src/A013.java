
import java.util.Arrays;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;

public class A013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str;
		//List strlist = new ArrayList();
				
		while (sc.hasNext()) {
			str = sc.nextLine();
						
			if (str.equals("#")) break;
			//strlist.add(str);
			
			String[] gg = str.split(" "); //被減數  減數 分離
			
			int ans_int = Math.abs(romanNum_to_int(gg[0])-romanNum_to_int(gg[1]));
			
			if (ans_int==0) {
				System.out.println("ZERO");
			} else if (ans_int<0) {
				System.out.println("減完為負數");
			} else {
				System.out.println(int_to_romanNum(ans_int));				
			}			
		}
		sc.close();
	}
	
	//羅馬數字  轉  數字
	static int romanNum_to_int (String a) {
		//System.out.println(a);
		a=a+"@"; //多補個字元  因為下面的 if判斷有時需要兩格
		int num=0;
				
		char[] ch = a.toCharArray(); 
		//System.out.println(ch.length);
		for (int i=0; i<(ch.length-1); i++) {
			if (ch[i]=='M') {
				num=num+1000;
				ch[i]='@';
			} else if (ch[i]=='C' & ch[i+1]=='M') {
				num=num+900;
				ch[i]='@';
				ch[i+1]='@';
			} else if (ch[i]=='D') {
				num=num+500;
				ch[i]='@';
			} else if (ch[i]=='C' & ch[i+1]=='D') {
				num=num+400;
				ch[i]='@';
				ch[i+1]='@';
			} else if (ch[i]=='C') {
				num=num+100;
				ch[i]='@';
			} else if (ch[i]=='X' & ch[i+1]=='C') {
				num=num+90;
				ch[i]='@';
				ch[i+1]='@';
			} else if (ch[i]=='L') {
				num=num+50;
				ch[i]='@';
			} else if (ch[i]=='X' & ch[i+1]=='L') {
				num=num+40;
				ch[i]='@';
				ch[i+1]='@';
			} else if (ch[i]=='X') {
				num=num+10;
				ch[i]='@';
			} else if (ch[i]=='I' & ch[i+1]=='X') {
				num=num+9;
				ch[i]='@';
				ch[i+1]='@';
			} else if (ch[i]=='V') {
				num=num+5;
				ch[i]='@';
			} else if (ch[i]=='I' & ch[i+1]=='V') {
				num=num+4;
				ch[i]='@';
				ch[i+1]='@';
			} else if (ch[i]=='I') {
				num=num+1;
				ch[i]='@';
			}	
			//System.out.println(Arrays.toString(ch));
		}
		//System.out.println("轉數字結果: "+num);
		return num;
	}
	
	static String int_to_romanNum (int k) {
		String ans_str="";
		
		while (k>0) {
			if (k>=1000) {
				ans_str=ans_str + "M";
				k=k-1000;
			} else if (k>=900) {
				ans_str=ans_str + "CM";
				k=k-900;
			} else if (k>=500) {
				ans_str=ans_str + "D";
				k=k-500;
			} else if (k>=400) {
				ans_str=ans_str + "CD";
				k=k-400;
			} else if (k>=100) {
				ans_str=ans_str + "C";
				k=k-100;
			} else if (k>=90) {
				ans_str=ans_str + "XC";
				k=k-90;
			} else if (k>=50) {
				ans_str=ans_str + "L";
				k=k-50;
			} else if (k>=40) {
				ans_str=ans_str + "XL";
				k=k-40;
			} else if (k>=10) {
				ans_str=ans_str + "X";
				k=k-10;
			} else if (k>=9) {
				ans_str=ans_str + "IX";
				k=k-9;
			} else if (k>=5) {
				ans_str=ans_str + "V";
				k=k-5;
			} else if (k>=4) {
				ans_str=ans_str + "IV";
				k=k-4;
			} else {
				ans_str=ans_str + "I";
				k=k-1;
			}
			
		}
		return ans_str;
	}

}
