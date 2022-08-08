class NumericalMethods{
    public double bisectionMethod(double a,double b,double epsilon,int count){
        count -= 1;
        double c = (a + b)/2,zerosOfA,zerosOfC;
        if(count > 0){
            zerosOfA = zerosOfFunction(a);
            zerosOfC = zerosOfFunction(c);
            if((b-c) <= epsilon)
                return c;
            else if((zerosOfA * zerosOfC) <= 0)
                return bisectionMethod(a,c,epsilon,count);
            else
                return bisectionMethod(c,b,epsilon,count);
        }
        else
            return c;
    }

    private double zerosOfFunction(double x){
        double zeros;
        zeros = Math.pow(x,2) + (2 * x) - 3;
        return zeros;
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
