class NumericalMethods{
    public double bisectionMethod(double a,double b,double epsilon,int count){
        count -= 1;
        double c = (a + b)/2;
        if(count > 0){
            if((b-c) <= epsilon)
                return c;
            else if((func(a) * func(c)) <= 0)
                return bisectionMethod(a,c,epsilon,count);
            else
                return bisectionMethod(c,b,epsilon,count);
        }
        else
            return c;
    }

    private double func(double x) {
        return (Math.pow(x, 2) + (2 * x) - 3);
    }
}

public class bisectionMethod {
    public static void main(String[] args) {
        double a = 0,b = 2,epsilon = 0.05,root;
        int limit = 5;
        NumericalMethods A = new NumericalMethods();
        root = A.bisectionMethod(a,b,epsilon,limit);
        System.out.println(root);
    }
}
