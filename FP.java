import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class FPGo {
	
		static Stack st = new Stack();
		static Queue<Character> pq = new PriorityQueue();
		static int i;
		static int p;
		static char ch=0;
		static Random rand = new Random();
		
	public static void main(String[] args) {
		
		
		
		
		
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
		
		newEl();//Новые элементы
		prPq();
		
		udal();//удаление случайных элементов
		prPq();
		
	}
	
	public static void prSt() {
		
		System.out.print("Стек  ");
		Character[] intArray = new Character[st.size()];
		st.toArray( intArray );
		Arrays.sort(intArray);
		for( char entry : intArray ){
			System.out.print( entry+" ");
		}
		System.out.println();
	}
	
	public static void prPq() {
		
		System.out.print("PriorityQueue  ");
		
		Character[] intArray = new Character[pq.size()];
		pq.toArray( intArray );
		Arrays.sort(intArray);
		for( char entry : intArray ){
			System.out.print( entry+" ");
		}
		System.out.println();
	}
	
	public static void newEl() {
		
		pq.clear();
		for(i=0;i<5;++i){
			
			p = rand.nextInt(23);
			ch = (char) (97 + p);
			
			pq.add(ch);
		}
		System.out.println();
	}
	
	public static void udal() {
		
		Iterator iter = pq.iterator();
        while(iter.hasNext()){
         
        	p = rand.nextInt(2);
        	
        	if(p==1){pq.remove();}
            //System.out.print(iter.next()+" ");
        }
	}

}
