class NumericalMethods{
    int count = 0;
    double root = 0;
    public double methodOfFalsePosition(double a,double b,double epsilon){
        double previousRoot = 0;
        if(count > 0)
            previousRoot = root;

        root = ((a * func(b)) - (b * func(a)))/(func(b) - func(a));
        if(Math.abs(root - previousRoot) <= epsilon )
            return root;
        else if((func(a) * func(root)) < 0){
            count++;
            return methodOfFalsePosition(a,root,epsilon);
        }
        else{
            count++;
            return methodOfFalsePosition(root,b,epsilon);
        }
    }

    private double func(double x) {
        return (Math.pow(x, 2) + (2 * x) - 3);
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
