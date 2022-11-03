package Anurag;
import java.util.*;
class node{
	int x=0;
	node(int c){
		x=c;
	}
}
public class practice {

	

	public static void main(String[] args) {
//		Integer n1 = new Integer(10);
//		HashMap<node,Boolean> map = new HashMap<node,Boolean>();
//		HashMap<Integer,Boolean> map1 = new HashMap<>();
//		map1.put(n1, true);
//		n1 = 20;
//		int n2 = 10;
//		Set<node> set=new HashSet<>();
//		set.add(new node(1));
//		set.add(new node(1));
//		System.out.println(set.size());
//		node n = new node(5);
//		map.put(n, true);
//		n.x = 10;
//		node n6 = new node(10);
//		System.out.println(map.getOrDefault(n6,false));
//		System.out.println(map1.get(n2)+" "+map1.size());
//		
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//		sc.nextLine();
//
//		for(int i=0;i<T;i++){
//			int N = sc.nextInt();
//			int M = sc.nextInt();
//			int[][] arr = new int[N][];
//			int[] res = new int[N+M-1];
//			sc.nextLine();
//			for(int j=0;j<N;j++){
//				arr[j] = new int[M];
//				for(int k=0;k<M;k++){
//					arr[j][k] = sc.nextInt();
//					int ind = j+k;
//					res[ind] += arr[j][k];
//					
//				}
//				sc.nextLine();
//			}
//
//			if(N==1 && M==1){
//				System.out.println("YES");
//			}else{
//				int x = arr[0][0];
//				int flag =0;
//				for(int val : res){
//					if(val != x){
//						flag = 1;
//						System.out.println("NO");
//					}
//				}
//				if(flag == 0) {
//					System.out.println("YES");
//				}	
//
//			}
//		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->o2-o1);
		pq.add(5);
		pq.add(7);
		pq.add(10);
		pq.add(8);
		pq.add(4);
		pq.add(2);
		pq.add(9);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
	}
}
