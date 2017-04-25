import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MP_Pr_5 {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        //Iterator riper;
        
        Comparator<Character> comparator1 = (Character o1, Character o2) -> {
            if( o1 > o2 ){return -1;}
            if( o1 < o2 ){return 1;}
            return 0;
        };
        
        Comparator<Character> comparator2 = (Character o1, Character o2) -> {
            if( o1 < o2 ){return -1;}
            if( o1 > o2 ){return 1;}
            return 0;
        };
        
        Stack s = new Stack();
        Queue<Character> q1 = new PriorityQueue(n, comparator1);
        Queue<Character> q2 = new PriorityQueue(n, comparator2);
        
        char[] alf={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
        for (int i=0;i<=n-1;++i){
        q1.add(alf[(int)(Math.random()*alf.length)]);}
        
            System.out.print("Первый контейнер по убыванию: ");
            Character[] Array1 = new Character[q1.size()];
            q1.toArray(Array1);
            Arrays.sort(Array1, comparator1);
            for(int i=0;i<q1.size();++i){
            System.out.print(Array1[i]+" ");}
            System.out.println();
        
                for(int i=0;i<q1.size();++i){
                char good=Array1[i];
                if (good>'a'){s.add(good);}}
        
                    System.out.print("Второй контейнер по убыванию: ");
                    Character[] Array2 = new Character[s.size()];
                    s.toArray(Array2);
                    Arrays.sort(Array2, comparator1);
                    for(int i=0;i<s.size();++i){
                    System.out.print(Array2[i]+" ");}
                    System.out.println();
        
                            System.out.print("Первый контейнер по возрастанию: ");
                            q1.toArray(Array1);
                            Arrays.sort(Array1, comparator2);
                            for(int i=0;i<q1.size();++i){
                            System.out.print(Array1[i]+" ");}
                            System.out.println();
        
                        System.out.print("Второй контейнер по возрастанию: ");
                        s.toArray(Array2);
                        Arrays.sort(Array2, comparator2);
                        for(int i=0;i<s.size();++i){
                        System.out.print(Array2[i]+" ");}
                        System.out.println();
        
                    for(int k=0;k<s.size()+q1.size();++k){
                    if(k<s.size()){q2.add(Array2[k]);}
                    if(k<q1.size()){q2.add(Array1[k]);}}
        
                System.out.print("Третий контейнер: ");
                Character[] Array3 = new Character[q2.size()];
                q2.toArray(Array3);
                Arrays.sort(Array3, comparator2);
                for(int i=0;i<q2.size();++i){
                System.out.print(Array3[i]+" ");}
                System.out.println();

            int l = 0,u=0;
            for(int i=0;i<q2.size();++i){
            char good=Array3[i];
            if (good>'a'){l++;}}
            System.out.println("Кол-во элементов 3-го контейнера удовлетворяющих заданному условию: "+l);
        
        for(int i=0;i<q2.size();++i){
	char good=Array3[i];
        if (good>'u'){++u;}}
        if(u>0)System.out.println("В 3 контейнере есть элементы удовлетворяющие условию");
        else System.out.println("В 3 контейнере нету элементов удовлетворяющих условию");
        /*for(char k:q){System.out.print(k);}
        System.out.println();
        riper=q.iterator();
        while(riper.hasNext()){
	System.out.print(riper.next()+" ");}
        
        System.out.println();
        
        riper=q.iterator();
        while(riper.hasNext()){
        char good=riper.next().toString().charAt(0);
        if (good=='a'){s.add(good);}}
        
        riper=s.iterator();
        while(riper.hasNext()){
	System.out.print(riper.next()+" ");}
        
        System.out.println();*/
        
        //while(!q1.isEmpty()){
	//System.out.print(q1.remove()+" ");}
        
        
    }
    
    
}