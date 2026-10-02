package week4;
import week3.StackInterface;

public class LinkedStack<T> implements StackInterface<T> {
    private LLNode<T> top;

    public LinkedStack(){
        this.top=null;
    }

    public void push(T element){
        LLNode<T> newNode = new LLNode<T>(element);
        newNode.setNext(this.top);
        this.top = newNode;
    }
    public T pop(){
        LLNode<T> temp = this.top;
        this.top = this.top.getNext();
        if (this.top.equals(-1)) {
            System.out.println("the stack is empty");}
        
        //remove an element from the top of the stack
        //note: what preconditions do we care about?
        return temp.getInfo(); //placeholder
    }
    public T top(){
        LLNode<T> temp = this.top;
        if (this.top == null) {
            System.out.println("the stack is empty");
        }
        else{ 
            return temp.getInfo();
        }
        //return the data in the element from the top of the stack
        //note: what preconditions do we care about?
        return temp.getInfo(); // placeholder
    }

    public boolean isEmpty(){
        return false; //placeholder
    }
    public boolean isFull(){
        return true; //placeholder
    }
}