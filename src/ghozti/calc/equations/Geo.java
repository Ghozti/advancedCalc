package ghozti.calc.equations;

import ghozti.calc.Main;

public class Geo {

    public static final String distance(double x2, double x1, double y2, double y1){
        double first = Math.pow((x2 - x1),2);
        double second = Math.pow((y2 - y1),2);
        return "d = ".concat(Double.toString(Math.sqrt(first + second)));
    }
}
