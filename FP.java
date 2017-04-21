import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class FPGo {
	
		static Stack st = new Stack();
		static Queue pq = new PriorityQueue();

	public static void main(String[] args) {
		
		int i,p;
		char ch=0;
		Random rand = new Random();
		
		
		
		System.out.print("Первоначальный массив"+" ");
		for(i=0;i<5;++i){
			
			p = rand.nextInt(23);
			ch = (char) (97 + p);
			System.out.print(ch+" ");
			
			st.push(ch);
			pq.add(ch);
		}
		System.out.println("\n");
		
		prPq();//Просмотр pq
		
		
	}
	
	public static void prSt() {
		
		System.out.print("Стек  ");
		while(!st.isEmpty()){
			System.out.print(st.pop()+" ");
		}
		System.out.println();
	}
	
	public static void prPq() {
		
		System.out.print("PriorityQueue  ");
		while(!pq.isEmpty()){
			System.out.print(pq.poll()+" ");
		}
		System.out.println();
	}

}
