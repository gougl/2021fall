public class MyLinkedStack<T> extends SinglyLinkedList<T> {
    public void push(T e){
        addFisrt(e);
    }

    public T pop(){
        return removeFirst();
    }
}
