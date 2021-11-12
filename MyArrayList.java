
// data formal definition
// operations on data
// basic operations: initialization, addition, remove, update
import static java.lang.System.exit;

public class MyArrayList<T> {
    // data fields
    private int Max = 100;
    private T[] data;
    private  int length;
    private int CAP;

    // initialization
    public MyArrayList(){
        data = (T[]) new Object[Max];
        length = 0;
        CAP = Max;
    }

    // addition: add e in the index
    public void add(T e, int index){
        if(index < 0 || index > length)
            return;
        if(length == 0)
            data[0] = e;
        else{
            for(int i=length; i>=index; i--)
                data[i+1] = data[i];
            data[index] = e;
        }
        length++;
    }


    // remove: remove the element of index and return the value
    public T remove(int index){
        if(index < 0 || index>length)
            exit(0);
        T v = data[index];
        for(int i = index; i<length; i++)
            data[i] = data[i+1];
        length--;
        return v;

    }

    // display
    public void display(){
        for(int i=0; i<length; i++)
            System.out.println(data[i]);
    }

    // add e at the first poistion
    public void addFirst(T e){
       add(e, 0);
    }
    // add e at the last poisition
    public void addLast(T e){
        add(e, length);
    }
    // remove the first elememnt
    public T removeFirst(){
       return remove(0);
    }

    public T removeLast(){
        length--;
        return data[length];
    }
    // update
    public void update(T e, int index){
        data[index] = e;
    }

}
