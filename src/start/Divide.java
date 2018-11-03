package start;

/**
 * Umożliwia dzielenie liczb. Wyrzuca wyjątek przy dzieleniu przez 0.
 */
public class Divide extends java.lang.Exception {

    /**
     * Dzieli dwie liczby
     *
     * @param a pierwsza liczba double
     * @param b druga liczba double
     * @return wynik dzielenia <i>a/b</i>
     * @throws DivideByZeroException Jeżeli <i>b</i> jest równe 0
     */
    public static double div(double a, double b) throws DivideByZeroException {
        if (b == 0)
            throw new DivideByZeroException(Double.toString(a), Double.toString(b));
        return a / b;
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
