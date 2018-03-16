package pl.eightbits;

import java.util.function.BiFunction;

public class ConcatenateToLongFunction implements BiFunction<String, String, Long> {

    @Override
    public Long apply(
        final String s,
        final String s2) {
        return Long.parseLong(s.concat(s2));
    }
}
