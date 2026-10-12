package week5;

public class ArrayUnboundedQueue<T> implements QueueInterface<T> {
    int size;
    T[] newArray;
    int count;
    private int rear,front;

    public ArrayUnboundedQueue(int sie){
        this.size = size;
        this.front = 0;
        this.rear = 0;
        this.newArray = new T[size];

    }



    @Override
    public void enqueue(T element) {
        if (isFull()){
          T[] copyArray = T[(size*2)];
            for (int i=0; i< size; i++){
                copyArray[i] = newArray[i];

            }
        }
        else{
            newArray[count] = element;
            count++;
         }

       
         
        
        
    }

    @Override
    public T dequeue() {
    throw new UnsupportedOperationException("Array Empty");
        }
    

    @Override
    public boolean isFull() {
       // throw new UnsupportedOperationException("Not implemented");
        if(newArray[size-1] != null){
            return true;
        }
        else{ return false;}
        
    }

    @Override
    public boolean isEmpty() {
        if(count <= 0 ){
            return true;}
        else {
            return false;
        }

        

        //throw new UnsupportedOperationException("Not implemented");
    }
}