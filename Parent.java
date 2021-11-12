public class Parent implements Print{
    private int num;

    public Parent(){
        System.out.println("this is from parent");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public void print(){
        System.out.println("Parent class implements interface");
    }
}
