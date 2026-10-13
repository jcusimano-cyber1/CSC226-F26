package medical_action_tracking;

public class LinkedStack<T> {
    private class Node {
        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
        }
    }

    private Node top;
    private int size;

    public void push(T item) {
        if (item == null){
            throw new IllegalArgumentException();
        }
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        size++;
        // TODO: Reject null items, then link a new node at the top and update size.
    }

    public T pop() {
        if(top == null){
            return null;
        }
        T item = top.data;
        top = top.next;
        size --;
        // TODO: Remove and return the top item, or return null when empty.
        return item;
    }

    public T peek() {
        if(top == null){
            return null;
        }
        // TODO: Return the top item without removing it, or null when empty.
        return top.data;
    }

    public boolean isEmpty() {
        if(size ==0){
            return true;
        }
        else{
        // TODO: Determine whether the stack contains any items.
        return false;}
    }

    public int size() {
        // TODO: Return the number of stacked items.
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        Node current = top;
        
        while(current != null){
            result.append(current.data);
        
            if(current.next != null){
                result.append(", ");
            }
             current = current.next;
         }
        result.append("]");


    
        // TODO: Build [top, next, ...] by traversing the stack without changing it.
        return result.toString();
    }
}
