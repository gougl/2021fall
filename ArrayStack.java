
public class ArrayStack<T> extends MyArrayList<T> {
    public void push(T e){
       addLast(e);
    }
    public T pop(){
        return removeLast();
    }
}
