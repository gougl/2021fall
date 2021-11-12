public class ArrayQueue<T> {
    private T[] data;
    private int CAP = 100;
    private int size;
    private int front, rear;

    public ArrayQueue(){
        data = (T[]) new Object[CAP];
        front = rear = 0;
        size = 0;
    }

    public void enqueue(T e){
        data[rear++] = e;
        size++;
    }

    public T dequeue(){
        T e = data[front];
        front++;
        size--;
        return e;
    }

    public boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }
}
