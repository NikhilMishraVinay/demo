package Anurag;
import java.util.*;
abstract class Student{
	protected abstract int marks(int a, int b);
	public void percentage() {
		
	}
}
public class Closestfriend extends Student {
	
	public static void main(String[] args) {
		
		int[] a = {1,0,0,4,0,2,0,0,5,6};
		
		int n = 10;
		Integer i , count = 0;
		for(i=0;i<n;i++) {
			if(a[i] != 0) {
				a[count++] = a[i];
			}
			while(count<n) {
				a[count++] = 0;
			}
			
		}
		for(i=0;i<n;i++) {
			System.out.print(a[i]+"  ");
		}

	}

	@Override
	int marks(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	
	

}
