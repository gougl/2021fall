public class Children extends Parent implements Print{
    private int num;
    public Children(){
        System.out.println("this is from children");
    }

    // overriding
    public void print(){
        System.out.println("Children class implements the interface");
    }
}
