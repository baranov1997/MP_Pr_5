import java.util.Arrays;

class BoxPrinter<T> { 
	
    private T val;
 
    public BoxPrinter(T argument) { 
        val = argument;
    } 
    
    public T getValue() { 
        return val; 
    }
} 
 
class ProbNewGO { 
    public static void main(String[] args) { 
    	int i = 0;
        BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(i);
        Integer intValue1 = value1.getValue();
        System.out.println(intValue1);
        
        BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world");
        String strValue2 = value2.getValue();
        System.out.println(strValue2);
        
        System.out.println();
       
    } 
    
} 