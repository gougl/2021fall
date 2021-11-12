import sun.awt.image.ImageWatched;

public class LinkedBinaryTree<T> {
    private node<T> p;

    private class node<T>{
        private T data;
        private node<T> left, right;

        public node(){
            left = null;
            right = null;
        }

        public node(T e){
            data = e;
        }

        public T getData() {
            return data;
        }

        public void setData(T e){
            data = e;
        }

        public node<T> getLeft(){
            return left;
        }

        public node<T> getRight(){
            return right;
        }

        public void setLeft(node<T> left){
            this.left = left;
        }

        public void setRight(node<T> right){
            this.right = right;
        }
    }

    private node<T> root;

    public LinkedBinaryTree(){
        root = null;
    }

    public LinkedBinaryTree(T e){
        root = new node<>(e);
    }


    //      A
    //    /   \
    //   B     D
    //    \
    //     C
//    public void createBT(){
//        node<Character> p = new node<>('A');
//        node<Character> q = new node<>('B');
//        p.setLeft(q);
//        node<Character> r = new node<>('D');
//        p.setRight(r);
//        node<Character> qr = new node<>('C');
//        q.setRight(qr);
//
//       preorder(p);
//
//    }

    public node<T> getRoot(){
        return root;
    }

    public T getRootData(){
        return root.getData();
    }

    public void setRoot(node<T> p){
        root = p;
    }

    public void setLeft(node<T> p, node<T> left){
        p.setLeft(left);
    }

    public void setLeft(node<T> p, T e){
        node<T> left = new node<>(e);
        p.setLeft(left);
    }


    public void setRight(node<T> p, node<T> right){
        p.setRight(right);
    }

    public void setRight(node<T> p, T e){
        node<T> right = new node<>(e);
        p.setRight(right);
    }

    public node<T> getLeft(node<T> p){
        return p.getLeft();
    }

    public node<T> getRight(node<T> p){
        return p.getRight();
    }

    public void preorder(node<T> root){
        if(root != null){
            System.out.println(root.getData());
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }

    public void inorder(node<T> root){
        if(root != null){
            inorder(root.getLeft());
            System.out.println(root.getData());
            inorder(root.getRight());
        }
    }

    public void postorder(node<T> root){
        if(root != null){
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.println(root.getData());
        }
    }
}
