package start;

public class Divide extends java.lang.Exception {

    public static double div(double a, double b) throws DivideByZeroException {
        if (b == 0)
            throw new DivideByZeroException(Double.toString(a), Double.toString(b));
        return a/b;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Potrzebne 2 argumenty");
            System.exit(1);
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        try {
            System.out.println(div(a, b));
        } catch (DivideByZeroException e) {
            //empty
        }
    }

}
