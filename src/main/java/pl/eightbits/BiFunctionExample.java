package pl.eightbits;

import java.util.function.BiFunction;

public class BiFunctionExample<R, S> {

    private final R r;
    private final S s;

    public BiFunctionExample(
        final R r,
        final S s) {
        this.r = r;
        this.s = s;
    }

    public <T> BiFunctionExample<R, T> map(
        final BiFunction<R, S, T> function) {
        final T apply = function.apply(r, s);
        return new BiFunctionExample<>(r, apply);
    }

    public void print() {
        System.out.println(String.format("%s    %s", r, s));
    }
}
