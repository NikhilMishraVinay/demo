package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class CodechefArray6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int N,K;
			N=sc.nextInt();
			K=sc.nextInt();
			ArrayList<String> forgLang=new ArrayList<String>();
			ArrayList<ArrayList<String>> phrase=new ArrayList<ArrayList<String>>();
			for(int j=0;j<N;j++) {
				String s=sc.next();
				forgLang.add(s);
				
			}
			 
			for(int j=0;j<K;j++) {
				int no_words=sc.nextInt();
				ArrayList<String> line=new ArrayList<String>();
				for(int k=0;k<no_words;k++) {
					String s=sc.next();
					line.add(s);
					
				}
				phrase.add(line);
			}
			
			for(String x:forgLang) {
				for(ArrayList<String> arr:phrase) {
					if(arr.contains(x)) {
						forgLang.set(forgLang.indexOf(x), "YES");
						break;
					}else {
						if(phrase.indexOf(arr)==(phrase.size()-1)) {
							forgLang.set(forgLang.indexOf(x), "NO");
						}else {
							continue;
						}
					}
				}
			}
			
			for(String x:forgLang) {
				System.out.print(x+" ");
			}
		}
		
		

	}

}
