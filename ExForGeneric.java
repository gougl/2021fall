
public class ExForGeneric<T> {
    private T data;
    // *******************
    // nested class
    private class NestedClass<T>{
        private T dataofnested;
        public NestedClass(){
            System.out.println("from the nested");
        }
        public NestedClass(T data){
            dataofnested = data;
        }

        public T getDataofnested(){
            return dataofnested;
        }
    }
    // ************************

    NestedClass<String> nc = new NestedClass<>("nested");
    public String getDataofNestedClass(){
        //System.out.println(nc.getDataofnested());
        return nc.getDataofnested();
    }

    public ExForGeneric(){
        // default constructor
    }

    public ExForGeneric(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }



}
