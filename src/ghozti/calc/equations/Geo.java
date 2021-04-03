package ghozti.calc.equations;

public class Geo {

    private static final String triangle1 =
            "  |\\\n" +
            "  | \\\n" +
            "  |  \\\n" +
            "  |   \\\n" +
            "o |    \\ h\n" +
            "  |     \\\n" +
            "  |      \\\n" +
            "  |       \\\n" +
            "  |________\\\n" +
            "      a";

    public static String distance(double x2, double x1, double y2, double y1){
        double first = Math.pow((x2 - x1),2);
        double second = Math.pow((y2 - y1),2);
        return "d = ".concat(Double.toString(Math.sqrt(first + second)));
    }

    public static String missingSide(double a, double b){
        return "missing side = ".concat(String.valueOf(180 - (a+b)));
    }

    public static String cos(double cos,double a, double h){
        System.out.println(triangle1);

        //cos = a/h
        double num = a;
        if (a == 0){
            num = h;
        }
        return "x = ".concat(String.valueOf(num * Math.cos(cos)));
    }

    public static String acos(double adj, double hyp){
        System.out.println(triangle1);
        return "cos = ".concat(String.valueOf(adj/hyp));
    }
}
