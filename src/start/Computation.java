package start;

@FunctionalInterface
public interface Computation<T> {
    T compute(T t);
}
