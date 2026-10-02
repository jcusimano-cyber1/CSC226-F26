package week4;


public class Recursion {
    public int fib(int n){
        int numbers;
        if (n < 1){ 
        return n; // base case
        fib(n - 1);// recurive, not implenment it into this
        numbers = fib(n) + fib(n-1);
        return numbers;
        
        }
    }
    
    public static Integer countHi(String value){
        if (value.equals("i") && value.equals("H")){ // base case
        countHi(value); // recursive
    
    }
    public static <T> void iterativePrinter(LLNode<T> node){
        while(node !=null){
            if(node.getInfo()!=null){
                System.out.println(node.getInfo());
            }
            node=node.getNext();
        }
    }
    public static <T> void recursivePrinter(LLNode<T> node){
       
    }

    public static <T> int recursiveCounter(LLNode<T> node, int counter){
        
    }

}
