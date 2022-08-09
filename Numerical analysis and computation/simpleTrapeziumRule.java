class NumericalIntegration{
    public double simpleTrapeziumRule(double a,double b,double h){
        double area;
        area = 0.5 * h * (func(a) + func(b));
        return area;
    }

    private double func(double x){
        return 2 * Math.pow(x,2);
    }
}

public class simpleTrapeziumRule {
    public static void main(String[] args) {
        double lowerLimit = 3,upperLimit = 5,N = 1,area;
        double h = (upperLimit - lowerLimit)/N;
        NumericalIntegration A = new NumericalIntegration();
        area = A.simpleTrapeziumRule(lowerLimit,upperLimit,h);
        System.out.println(area);
    }
}
