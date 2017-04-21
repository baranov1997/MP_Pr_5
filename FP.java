import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class FPGo {

	public static void main(String[] args) {
		
		int i,p;
		char ch=0;
		Random rand = new Random();
		
		Stack st = new Stack();
		Queue pq = new PriorityQueue();
		
		System.out.print("Первоначальный массив"+" ");
		for(i=0;i<5;++i){
			
			p = rand.nextInt(23);
			ch = (char) (97 + p);
			System.out.print(ch+" ");
			
			st.push(ch);
			pq.add(ch);
		}
		System.out.println("\n");
		
	}

}
