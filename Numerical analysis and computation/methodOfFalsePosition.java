class NumericalMethods{
    int count = 0;
    double root = 0;
    public double methodOfFalsePosition(double a,double b,double epsilon){
        double zerosOfA,zerosOfB,zerosOfRoot;
        double previousRoot = 0;
        if(count > 0)
            previousRoot = root;
        zerosOfA = zerosOfFunction(a);
        zerosOfB = zerosOfFunction(b);
        root = ((a * zerosOfB) - (b * zerosOfA))/(zerosOfB - zerosOfA);
        zerosOfRoot = zerosOfFunction(root);
        if(Math.abs(root - previousRoot) <= epsilon )
            return root;
        else if((zerosOfA * zerosOfRoot) < 0){
            count++;
            return methodOfFalsePosition(a,root,epsilon);
        }
        else{
            count++;
            return methodOfFalsePosition(root,b,epsilon);
        }
    }

    private double zerosOfFunction(double x) {
        double zeros;
        zeros = (Math.pow(x, 2) + (2 * x) - 3);
        return zeros;
    }
}

public class methodOfFalsePosition {
    public static void main(String[] args) {
        double a = 0,b = 2,epsilon = 0.05,root;
        NumericalMethods A = new NumericalMethods();
        root = A.methodOfFalsePosition(a,b,epsilon);
        System.out.printf("%.4f%n",root);
    }
}
