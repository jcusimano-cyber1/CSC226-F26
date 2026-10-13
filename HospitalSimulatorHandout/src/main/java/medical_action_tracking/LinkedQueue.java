package medical_action_tracking;

public class LinkedQueue<T> {
    private class Node {
        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
        // TODO: Initialize an empty queue.
    }

    public void enqueue(T item) {
        if(item == null){
            throw new IllegalArgumentException();
        }
        Node newNode = new Node(item);
        if (rear==null){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        size++; // finish the rest
        // TODO: Add a node at the rear. Update both references when the queue is empty.
    }

    public T dequeue() {
        if(front==null){
            return null;
        }
        T item = front.data;
        front = front.next;
        size--;
        
        if(front == null){
            rear = null;
        }
        return item;
        // TODO: Remove and return the front item, or return null if empty.
        // TODO: When removing the last item, make both front and rear null.
    
    }

    public T peekFront() {
        if (front == null){
            return null;
        }
        // TODO: Return the front item without removing it, or null if empty.
        return front.data;
    }

    public boolean isEmpty() {
        // TODO: Determine whether the queue contains any items.
        return size == 0;
    }

    public int size() {
        // TODO: Return the number of queued items.
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        
        appendNodesRecursively(front, result);
        
        
        // TODO: Recursively build a string from front to rear without changing the queue.
        result.append("]");
        return result.toString();
    }

    private void appendNodesRecursively(Node current, StringBuilder result) {
        if(current == null){
            return;
        }
        result.append(current.data);
        
        if(current.next != null){
            result.append(", ");

        }
        appendNodesRecursively(current.next, result);
        // TODO: Add the current node's data, then recursively visit current.next.
        // TODO: Stop at the null-node base case.
    }
}
