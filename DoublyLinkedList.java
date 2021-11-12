public class DoublyLinkedList<T> {

    //******** nested class *************
    private class node<T>{
        // element, prev, next
        T data;
        node<T> prev;
        node<T> next;

        // constructor without args
        public node(){
           prev = null;
           next = null;
        }
        // overloading constructor
        public node(T e){
            data = e;
        }
        public node(T e, node<T> prev, node<T> next){
            data = e;
            this.prev = prev;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public node<T> getNext() {
            return next;
        }

        public node<T> getPrev() {
            return prev;
        }

        public void setData(T e){
            data = e;
        }

        public void setPrev(node<T> prev){
            this.prev = prev;
        }

        public void setNext(node<T> next){
            this.next = next;
        }
    }
    //************************************

    node<T> header;
    node<T> tailer;
    int size = 0;

    public DoublyLinkedList(){
        header = new node<>();
        tailer = new node<>();
        header.setNext(tailer);
    }

    public boolean isEmpty(){
        if(header.getNext() == tailer)
            return true;
        return false;
    }

    public void addFirst(T e){
        node<T> p = new node<>(e);
        p.setNext(header.getNext());
        header.getNext().setPrev(p);
        p.setPrev(header);
        header.setNext(p);
    }

    public void display(){
        node<T> p = header.getNext();
        while(p != tailer){
            System.out.println(p.getData());
            p = p.getNext();
        }
    }

    public void addLast(T e){
        node<T> p = new node<>(e);
        p.setNext(tailer);
        tailer.getPrev().setNext(p);
        p.setPrev(tailer.getPrev());
        tailer.setPrev(p);
    }

    public T removeFirst(){
        T e = header.getNext().getData();
        header.setNext(header.getNext().getNext());
        return e;
    }

    public T removeLast(){
        T e = tailer.getPrev().getData();
        node<T> p = tailer.getPrev();
        tailer.setPrev(p.getPrev());
        p.getPrev().setNext(tailer);
        return e;
    }
}
