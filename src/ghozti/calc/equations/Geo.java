package ghozti.calc.equations;

public class Geo {

    public static String distance(double x2, double x1, double y2, double y1){
        double first = Math.pow((x2 - x1),2);
        double second = Math.pow((y2 - y1),2);
        return "d = ".concat(Double.toString(Math.sqrt(first + second)));
    }

    public static String missingSide(double a, double b){
        return "missing side = ".concat(String.valueOf(180 - (a+b)));
    }

    public static String cos(){
        System.out.println( "  |\\\n" +
                            "  | \\\n" +
                            "  |  \\\n" +
                            "  |   \\\n" +
                            "a |    \\ c\n" +
                            "  |     \\\n" +
                            "  |      \\\n" +
                            "  |       \\\n" +
                            "  |________\\\n" +
                            "   b");
        return "";
    }
}
