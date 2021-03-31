package ghozti.calc.equations;

public class Algebra {

    public static double slope(float x1, float x2, float y1, float y2){
        return (y2 - y1)/(x2 - x1);
    }

    public static String pointSlope(double x1, double y1, double m){
        //y - y1 = m(x + x1)
        String step1 = m + "x" + (m*x1 > 0 ? "+" : "-") + m * x1;
        return "";
    }
}
