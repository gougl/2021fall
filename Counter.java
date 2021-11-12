public class Counter implements Print{
    // data field
    private int count;

    // constructors
    // default constructor: is a constructor without arguments
   public Counter(){
      System.out.println("this is a default constructor");
   }

   // overloading constructor
    public Counter(int count){
      this.count = count;
      System.out.println("this is a overloading constructor");
    }

    // getMethod
    public int getCount(){
       return count;
    }

    // setMethod
    public void setCount(int count){
       this.count = count;
    }

    // overloading: same method name with different arguments
    public void increment(){
       count++;
    }

    public void increment(int n){
       count = count + n;
    }

    // static method
    public static void exampleforstaticmethod(){
       System.out.println("this is from static method");
    }

    // overriding
    public void print(){
       System.out.println("this is an implementation of Print");
    }

}
