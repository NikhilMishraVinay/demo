package Anurag;

import java.util.LinkedList;

public class linked {

	public static void main(String[] args) {
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(5);
		list1.add(8);
		list1.add(4);
		System.out.println(list1);
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(8);
		list2.add(3);
		list2.add(7);
		System.out.println(list2);
		
		
		int i;
		int carry=0;
		for(i=2;i>=0;i--) {
			
			int x=list1.get(i)+list2.get(i);
			System.out.println(x);
			x+=carry;
			carry=x/10;
			x=x%10;
			list1.set(i, x);
		}
		list1.addFirst(carry);
		System.out.println(list1);
		System.out.println();
		
	}

}
