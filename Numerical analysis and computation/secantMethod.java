class NumericalMethod{
    int count = 0;
    double root = 0;
    public double secantMethod(double a,double b,double epsilon){
        double previousRoot = 0;
        if(count > 0)
            previousRoot = root;
        root = b - func(b)*((b-a) / (func(b)-func(a)));
        if(Math.abs(root-previousRoot) < epsilon)
            return root;
        else{
            count++;
            return secantMethod(b,root,epsilon);
        }
    }

    private double func(double x) {
        return (Math.pow(x, 2) + (2 * x) - 3);
    }
}

public class secantMethod {
    public static void main(String[] args) {
        double a = 0,b = 2,epsilon = 0.06,root;
        NumericalMethod A = new NumericalMethod();
        root = A.secantMethod(a,b,epsilon);
        System.out.printf("%.4f%n",root);
    }
}
