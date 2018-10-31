package start;

public class Multiplier implements Computation<Double> {

    private double a;

    public Multiplier(double a) {
        this.a = a;
    }

    public Double compute(Double x) {
        return a * x;
    }
}
