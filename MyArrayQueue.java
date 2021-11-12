public class MyArrayQueue<T> extends MyArrayList<T> {
    public void enqueue(T e){
        addLast(e);
    }

    public T dequeue(){
        return removeFirst();
    }
}
