package start;

/**
 * Interfejs funkcyjny z metodą <tt>compute</tt>
 * @param <T>
 */
@FunctionalInterface
public interface Computation<T> {
    T compute(T t);
}
