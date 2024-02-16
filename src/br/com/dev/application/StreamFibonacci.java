package br.com.dev.application;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFibonacci {

    public static void main(String[] args) {

        Stream<Long> st = Stream
                .iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]})
                .map(p -> p[0]);

        System.out.println(Arrays.toString(st.limit(10).toArray()));
    }
}
