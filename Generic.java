

public class Generic<A, B> {
    private A num1;
    private B num2;


    public Generic(A num1, B num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public A getNum1(){
        return num1;
    }

    public B getNum2(){
        return num2;
    }
}
