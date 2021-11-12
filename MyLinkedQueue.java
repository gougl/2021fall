public class MyLinkedQueue<T> extends SinglyLinkedList<T> {

    public void enqueue(T e){
        addLast(e);
    }

    public T dequeue(){
        return removeFirst();
    }
}
