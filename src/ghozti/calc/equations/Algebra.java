package ghozti.calc.equations;

public class Algebra {

    public static double slope(float x1, float x2, float y1, float y2){
        return (y2 - y1)/(x2 - x1);
    }

    public static String pointSlope(double x1, double y1, double m){
        //mx
        String mx = m + "x";
        //mx1
        double mx1 = m * x1;
        //y1 * mx1
        double y1Mx1 = (y1 > 0 ? y1 - mx1 : y1 + mx1);
        //final result
        return "y = ".concat(mx).concat((y1Mx1 > 0 ? " + " : " - ")).concat(String.valueOf(y1Mx1));
    }

    public static double slope(double y2, double y1, double x2, double x1){
        return (y2 - y1) / (x2 - x1);
    }
}
