import javax.sound.midi.SysexMessage;

public class Hello {
    public static void main(String[] args){
       System.out.println("Hello world");

       //Counter a = new Counter();
//       Counter b = new Counter(6);
       // b.count; wrong, because count is private
//        System.out.println(b.getCount());
//        b.setCount(10);
//        b.increment();
//        b.increment();
//        b.increment(9);
//        System.out.println(b.getCount());

//        Counter.exampleforstaticmethod();

//        Parent p = new Parent();
//        p.setNum(7);
//        System.out.println(p.getNum());
//        // inheritance
//        System.out.println("create a children");
//        Children c = new Children();
//        c.setNum(9);
//        System.out.println(c.getNum());
//        // constructor chain by inheritance
//        System.out.println("create an object for grandson");
//        Grandson g = new Grandson();
//        p.setNum(2);
//        System.out.println(p.getNum());
//
//        // polymophism
//        Parent d = new Grandson();
//        d.setNum(5);
//        System.out.println(d.getNum());

//        Counter aa = new Counter(5);
//        aa.print();
//
//        Parent bb = new Parent();
//        bb.print();
//
//        Children cc = new Children();
//        cc.print();
//
//        Grandson dd = new Grandson();
//        dd.print();

//        Generic<Double, Integer> ee = new Generic<>(3.14, 10);
//
//        System.out.println(ee.getNum1());
//        System.out.println(ee.getNum2());

//        ExForGeneric<Integer> ex_gen = new ExForGeneric<>(100);
//        System.out.println(ex_gen.getData());
//        ex_gen.setData(12);
//        System.out.println(ex_gen.getData());
//        System.out.println(ex_gen.getDataofNestedClass());

//        MyArrayList<Integer> arr = new MyArrayList<>();
//        arr.add(1, 0);
//        arr.add(2, 1);
//        arr.add(3,0);
//        arr.display();
//
//        arr.update(10,0);
//        arr.display();

//        SinglyLinkedList<Integer> sl = new SinglyLinkedList<>();
//        System.out.println(sl.isEmpty());
//
//        sl.addFisrt(5);
//        sl.addFisrt(6);
//        sl.addFisrt(7);
//
//        sl.addLast(9);
//        sl.addLast(10);
//        sl.display();
//
//        System.out.println("remove the first: "+sl.removeFirst());
//        System.out.println("remove the first: "+sl.removeFirst());
//        System.out.println("remove the first: "+sl.removeFirst());
//
//        ArrayStack<Integer> as = new ArrayStack<>();
//        as.push(1);
//        as.push(2);
//        System.out.println(as.pop());
//        System.out.println(as.pop());

//        DoublyLinkedList<Integer> dl = new DoublyLinkedList<>();
//        System.out.println(dl.isEmpty());
//        dl.addFirst(1);
//        dl.addFirst(2);
//        dl.addFirst(3);
//
//        dl.addLast(4);
//        dl.addLast(5);
//
//        dl.removeFirst();
//        dl.removeFirst();
//        dl.removeLast();
//        dl.display();
//        System.out.println(dl.isEmpty());


//        MyArrayStack<Integer> ms = new MyArrayStack<>();
//        ms.push(2);
//        ms.push(4);
//        ms.push(7);
//
//        System.out.println(ms.pop());
//        System.out.println(ms.pop());
//
//        ArrayStack<Integer> as = new ArrayStack<>();
//        as.push(3);
//        as.push(5);
//
//        System.out.println(as.pop());

//        MyLinkedStack<Integer> ls = new MyLinkedStack<>();
//        ls.push(5);
//        ls.push(6);
//        ls.push(7);
//
//        System.out.println(ls.pop());
//        System.out.println(ls.pop());
//        System.out.println(ls.pop());

//        Factorial f = new Factorial();
//        int value = f.F(5);
//        System.out.println(value);
//
//        ArrayQueue<Integer> aq = new ArrayQueue<>();
//        aq.enqueue(5);
//        aq.enqueue(3);
//        System.out.println(aq.dequeue());
//        aq.enqueue(9);
//        aq.enqueue(7);
//        System.out.println(aq.dequeue());
//        System.out.println(aq.dequeue());
//        System.out.println(aq.dequeue());
//        System.out.println(aq.isEmpty());

//        MyArrayQueue<Integer> maq = new MyArrayQueue<>();
//        maq.enqueue(3);
//        maq.enqueue(5);
//        maq.enqueue(7);
//        System.out.println(maq.dequeue());
//        System.out.println(maq.dequeue());

//        MyLinkedQueue<Integer> mlq = new MyLinkedQueue<>();
//        mlq.enqueue(10);
//        mlq.enqueue(20);
//        mlq.enqueue(30);
//
//        System.out.println(mlq.dequeue());
//        System.out.println(mlq.dequeue());
//        System.out.println(mlq.dequeue());

        LinkedBinaryTree<Character> bs = new LinkedBinaryTree<>('A');
        bs.setLeft(bs.getRoot(),'B');
        bs.setRight(bs.getRoot(), 'D');
        //System.out.println(bs.getRootData());
        bs.setRight(bs.getLeft(bs.getRoot()), 'C');

        bs.preorder(bs.getRoot());

        bs.inorder(bs.getRoot());

        bs.postorder(bs.getRoot());

    }

}
