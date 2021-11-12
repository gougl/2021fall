
public class MyArrayStack<T> {
    private T[] data;
    private int top = 0;
    private int size = 0;
    private final int CAP = 100;

    public MyArrayStack(){
        data = (T[]) new Object[CAP];
    }

    public void push(T e){
        data[top] = e;
        top++;
    }

    public T pop(){
        top--;
        return data[top];
    }

    public boolean isEmpty(){
        if(top == 0)
            return true;
        return false;
    }
}
