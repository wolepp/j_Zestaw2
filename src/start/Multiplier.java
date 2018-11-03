package start;

/**
 * Klasa umożliwia pomnożenie liczby <tt>Double</tt>
 * przez zdefiniowaną przy konstruowaniu obiektu liczbę.
 */
public class Multiplier implements Computation<Double> {

    private double a;

    /**
     *
     * @param a czynnik mnożenia
     */
    public Multiplier(double a) {
        this.a = a;
    }

    /**
     * Nadpisuje metodę <tt>compute</tt> z interfejsu
     * funkcyjnego <tt>Computation</tt>.
     * @see Computation
     * @param x liczba do pomnożenia
     * @return liczbę <tt>x</tt> pomnożoną przez
     * zdefiniowany czynnik.
     */
    public Double compute(Double x) {
        return a * x;
    }
}
