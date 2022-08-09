class NumericalIntegration{
    public double simpleSimpsonsOneThirdRule(double a,double b,double h){
        double area;
        area = (h/3) * (func(a) + 4 * func((a+b)/2) + func(b));
        return area;
    }

    private double func(double x){
        return 2 * Math.pow(x,2);
    }
}

public class simpleSimpsonsOneThirdRule {
    public static void main(String[] args) {
        double lowerLimit = 3,upperLimit = 5,area;
        double h = (upperLimit - lowerLimit)/2;
        NumericalIntegration A = new NumericalIntegration();
        area = A.simpleSimpsonsOneThirdRule(lowerLimit,upperLimit,h);
        System.out.println(area);
    }
}
