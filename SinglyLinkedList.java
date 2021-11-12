public class SinglyLinkedList<E> {

    // define node
    private class Node<E>{
        private E element;
        private Node<E> next;

        public Node(){}
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }

        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E> n){
            next = n;
        }
    }

    Node<E> head;
    Node<E> tail;
    private int size;

    public SinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        if(head==null)
            return true;
        return false;
    }

    // insert e at the head
    public void addFisrt(E e){
        Node<E> newest = new Node<>(e, head);
        head = newest;
        if(size == 0)
            tail = head;
        size++;
    }

    // display the linkedlist
    // cannot move the head
    public void display(){
        Node<E> p = head;
        while(p!=null){
            System.out.println(p.getElement());
            p = p.getNext();
        }
    }

    // insert e at the tail
    public void addLast(E e){
        Node<E> newest = new Node<>(e, null);
        if(isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    // remove at the head
    public E removeFirst(){
        if(isEmpty())
            return null;
        E e = head.getElement();
        head = head.getNext();
        return e;
    }

    // question: how to remove at the tail
    // pls implement it.
}
