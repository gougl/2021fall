public class Factorial {
    // n! = n*(n-1)!

    public int F(int n){
        if(n == 0) //base case
            return 1;
        return n*F(n-1); // recursive case
    }
}

//
// F(5) calls F(4) calls F(3) calls F(2) calls F(1) calls F(0)
// F(0) return 1; base case
// F(1) = 1*F(0) = 1;
// F(2) = 2*F(1) = 2;
// F(3) = 3*F(2) = 6;
// F(4) = 4*F(3) = 24;
// F(5) = 5*F(4) = 120;