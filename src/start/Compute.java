package start;

import java.util.Arrays;

public class Compute {

    static private final int n = 20;

    public static void main(String[] args) {

        System.out.println("Multiplier");
        Multiplier multiplier = new Multiplier(2);
        Compute.plot(0, 19, multiplier);
        System.out.println();

        System.out.println("Klasa anonimowa z Divide.div");
        Compute.plot(-10, 9, new Computation<Double>() {
            public Double compute(Double x) {
                try {
                    return Divide.div(10, x);
                } catch (DivideByZeroException e) {
                    System.out.println("\tDZIELENIE PRZEZ 0");
                }
                return 0d;
            }
        });
        System.out.println();

        System.out.println("Lambda (x^2)");
        Compute.plot(-30, 27, x -> x*x);
        System.out.println();

        System.out.println("Referencja do metody statycznej: Math.log()");
        Compute.plot(1, 15201, Math::log);
        System.out.println();

        Compute compute = new Compute();
        System.out.println("Referencja do metody niestatycznej (pewien wielomian)");
        Compute.plot(0,38, compute::wielomian);
        System.out.println();

        //===============================================
        double[] array = new double[20];
        for (int i = 0; i < array.length; i++)
            array[i] = i;
            //array[i] = Math.random();

        apply(array, x -> (x % 2 == 0) ? x*2 : x*3 );
        System.out.println("Funkcja apply na tablicy");
        System.out.println(Arrays.toString(array));
    }


    public static void plot(double xmin, double xmax, Computation<Double> f) {

        double distance = (xmax - xmin) / (n-1);
        double argument = xmin;
        for (int i = 0; i < n; i++) {
            System.out.println("f("+argument+") = " + f.compute(argument));
            argument += distance;
        }

    }

    public static void apply(double[] array, Computation<Double> f) {
        for (int i = 0; i < array.length; i++)
            array[i] = f.compute(array[i]);
    }

    private double wielomian(double x) {
        //3x^3 + 4x^2 - 2x + 0.07
        return (3*Math.pow(x, 3) + 4*Math.pow(x,2) - 2*x + 0.07);
    }
}
