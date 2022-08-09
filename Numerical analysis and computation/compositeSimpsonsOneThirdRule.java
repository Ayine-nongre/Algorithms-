class NumericalIntegration{
    public double compositeSimpsonsOneThirdRule(double a,double b,double h,int N){
        double area,evenSubIntervalAreas = 0,oddSubIntervalAreas = 0;
        area = func(a);
        area += func(b);
        for(int i = 1; i < N;i += 2)
            oddSubIntervalAreas += func(a + (i * h));
        for(int j = 2; j < (N-1);j += 2)
            evenSubIntervalAreas += func(a + (j * h));
        area += (4 * oddSubIntervalAreas) + (2 * evenSubIntervalAreas);
        area = (h/3) * area;
        return area;
    }

    private double func(double x){
        return 2 * Math.pow(x,2);
    }
}

public class compositeSimpsonsOneThirdRule {
    public static void main(String[] args) {
        double lowerLimit = 3,upperLimit = 5;
        int N = 4;
        double area;
        double h = (upperLimit - lowerLimit)/N;

        NumericalIntegration A = new NumericalIntegration();
        area = A.compositeSimpsonsOneThirdRule(lowerLimit,upperLimit,h,N);
        System.out.println(area);
    }
}
