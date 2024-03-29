class NumericalIntegration{
    public double compositeTrapeziumRule(double h,double upperLimit,double lowerLimit,int N){
        double area = 0,subIntervalAreas = 0;
        area += func(lowerLimit);
        area += func(upperLimit);
        for (int i = 1; i < N; i++)
            subIntervalAreas += func(lowerLimit + (i*h));
        area += 2*(subIntervalAreas);
        area = (h/2)*(area);
        return area;
    }

    private double func(double x){
        return 2 * Math.pow(x,2);
    }
}

public class compositeTrapeziumRule {
    public static void main(String[] args) {
        double lowerLimit = 3,upperLimit = 5;
        int N = 4;
        double area;
        double h = (upperLimit - lowerLimit)/N;

        NumericalIntegration A = new NumericalIntegration();
        area = A.compositeTrapeziumRule(h,upperLimit,lowerLimit,N);
        System.out.println(area);
    }
}
